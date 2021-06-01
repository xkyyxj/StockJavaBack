package com.cassiopeia.stock.controller;

import com.cassiopeia.config.Constant;
import com.cassiopeia.stock.beans.*;
import com.cassiopeia.stock.calculator.EMACalculator;
import com.cassiopeia.stock.dto.TushareData;
import com.cassiopeia.stock.mapper.AdjFactorMapper;
import com.cassiopeia.stock.mapper.EmaValueMapper;
import com.cassiopeia.stock.mapper.StockBaseInfoMapper;
import com.cassiopeia.stock.mapper.StockIndexBaseinfoMapper;
import com.cassiopeia.stock.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.URI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

@RestController
@RequestMapping("/fetchData")
public class FetchDataController {

    final WebClient webClient;
    final StockBaseInfoMapper baseInfoMapper;
    final EmaValueMapper emaValueMapper;
    final AdjFactorMapper adjFactorMapper;
    final StockIndexBaseinfoMapper baseinfoMapper;
    final ExecutorService executor;

    @Autowired
    public FetchDataController(WebClient webClient, StockBaseInfoMapper baseInfoMapper, AdjFactorMapper adjFactorMapper,
                               EmaValueMapper emaValueMapper, StockIndexBaseinfoMapper baseinfoMapper, @Qualifier("defaultExecutor") ExecutorService executor) {
        this.webClient = webClient;
        this.baseInfoMapper = baseInfoMapper;
        this.adjFactorMapper = adjFactorMapper;
        this.emaValueMapper = emaValueMapper;
        this.baseinfoMapper = baseinfoMapper;
        this.executor = executor;
    }

    @RequestMapping("/hello")
    public String hello() {
        return "123123";
    }

    @RequestMapping("/fetchAll")
    @Transactional
    public String fetchAllData() throws ParseException {
        // 找到最新的日期
        String lastDay = baseInfoMapper.queryLastDay();
        // 删除大于这个日期的所有数据
        // 复权因子
        AdjFactorExample adjExample = new AdjFactorExample();
        AdjFactorExample.Criteria criteria = adjExample.createCriteria();
        criteria.andTradeDateGreaterThan(lastDay);
        adjFactorMapper.deleteByExample(adjExample);

        // ema的值
        EmaValueExample emaExample = new EmaValueExample();
        EmaValueExample.Criteria emaCriteria = emaExample.createCriteria();
        emaCriteria.andTradeDateGreaterThan(lastDay);
        emaValueMapper.deleteByExample(emaExample);

        // baseInfo
        StockIndexBaseinfoExample baseExample = new StockIndexBaseinfoExample();
        StockIndexBaseinfoExample.Criteria baseCriteria = baseExample.createCriteria();
        emaCriteria.andTradeDateGreaterThan(lastDay);
        baseinfoMapper.deleteByExample(baseExample);

        // 获取所有的可获取天
        SimpleDateFormat sdf =   new SimpleDateFormat( " yyyyMMdd" );
        Date date = sdf.parse(lastDay);
        Date currDate = new Date();
        List<String> allDays = new ArrayList<>();
        while(date.before(currDate) && !DateUtils.isSameDay(date, currDate)) {
            date = DateUtils.getNextDay(date);
            allDays.add(DateUtils.formatDate("yyyyMMdd",date));
        }

        if(allDays.size() <= 0) {
            return "";
        }

        for(String dayStr : allDays) {
            fetchAdjFactor(dayStr);
            fetchBaseInfo(dayStr);
        }

        return "";
    }

    private void fetchBaseInfo(String dayStr) {
        // 发送网络请求获取数据
        HashMap<String, Object> paraMap = new HashMap<> ();
        paraMap.put("trade_date", dayStr);
        HashMap<String, Object> tempParam = constructReqMap("daily", paraMap);
        TushareData webData =  webClient.post().uri(URI.create(Constant.TUSHARE_URI)).contentType(MediaType.APPLICATION_JSON).bodyValue(tempParam).retrieve().bodyToMono(TushareData.class).block();
        // FIXME -- 此处是不是可以玩一个异步的操作？？？？？？
        TushareData.Data data = webData.getData();
        List<List<Object>> realData = data.getItems();
        if(realData == null || realData.size() == 0) {
            return;
        }

        ConcurrentLinkedQueue<StockBaseInfo> queue = new ConcurrentLinkedQueue<>();
        ArrayList<StockBaseInfo> tempInsertList = new ArrayList<>(1024);
        // 开启若干个线程计算ema的值
        int coreCount = Runtime.getRuntime().availableProcessors();
        List<Future<?>>  retFuture = new ArrayList<>(coreCount);
        for(int i = 0;i < coreCount;i++) {
            retFuture.add(executor.submit(new EMACalculator(queue)));
        }
        for(List<Object> tempObj : realData) {
            if(tempObj == null || tempObj.size() == 0) {
                continue;
            }
            StockBaseInfo baseInfo = new StockBaseInfo();
            baseInfo.setTsCode((String) tempObj.get(0));
            baseInfo.setTradeDate((String) tempObj.get(1));
            baseInfo.setOpen((Double) tempObj.get(2));
            baseInfo.setHigh((Double) tempObj.get(3));
            baseInfo.setLow((Double) tempObj.get(4));
            baseInfo.setClose((Double) tempObj.get(5));
            baseInfo.setPreClose((Double) tempObj.get(6));
            baseInfo.setChange((Double) tempObj.get(7));
            baseInfo.setPctChg((Double) tempObj.get(8));
            baseInfo.setVol((Double) tempObj.get(9));
            baseInfo.setAmount((Double) tempObj.get(10));
            tempInsertList.add(baseInfo);
            if(tempInsertList.size() == 1024) {
                baseInfoMapper.batchInsert(tempInsertList);
                queue.addAll(tempInsertList);
                tempInsertList.clear();
            }
        }
        if(tempInsertList.size() > 0) {
            baseInfoMapper.batchInsert(tempInsertList);
        }

        for(Future<?> future : retFuture) {
            future.cancel(true);
        }
    }

    public void fetchAdjFactor(String dayStr) {
        HashMap<String, Object> paraMap = new HashMap<> ();
        paraMap.put("trade_date", dayStr);
        HashMap<String, Object> tempParam = constructReqMap("adj_factor", paraMap);
        TushareData webData = webClient.post().uri(URI.create(Constant.TUSHARE_URI)).contentType(MediaType.APPLICATION_JSON).bodyValue(tempParam).retrieve().bodyToMono(TushareData.class).block();
        List<AdjFactor> adjFactors = AdjFactor.convertFromTushareData(webData);
        int startIndex = 0;
        while(startIndex < adjFactors.size()) {
            List<AdjFactor> subList = adjFactors.subList(startIndex, Math.min(startIndex + 1024, adjFactors.size()));
            adjFactorMapper.batchInsert(subList);
            startIndex = startIndex + 1024;
        }
    }

    private HashMap<String, Object> constructReqMap(String api, HashMap<String, Object> realParam) {
        HashMap<String, Object> paraMap = new HashMap<> ();
        paraMap.put("api_name", api);
        paraMap.put("token", "20c67a94089468176b4f9185aad4051d523edebec1a6fea334d47038");
        paraMap.put("params", realParam);
        return paraMap;
    }

}
