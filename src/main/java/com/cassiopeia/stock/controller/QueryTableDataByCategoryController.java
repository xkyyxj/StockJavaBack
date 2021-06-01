package com.cassiopeia.stock.controller;

import com.cassiopeia.stock.dto.TableMeta;
import com.cassiopeia.stock.mapper.TableMetaMapper;
import com.cassiopeia.stock.service.FetchDataService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/queryTableData")
public class QueryTableDataByCategoryController {

    static final HashMap<String, String> TABLE_NAME_TO_MAPPER = new HashMap<>();

    static {
        TABLE_NAME_TO_MAPPER.put("history_down", "historyDownMapper");
    }

    final TableMetaMapper tableMetaMapper;
    final FetchDataService fetchDataService;

    public QueryTableDataByCategoryController(TableMetaMapper tableMetaMapper,
                                              FetchDataService fetchDataService) {
        this.tableMetaMapper = tableMetaMapper;
        this.fetchDataService = fetchDataService;
    }

    @RequestMapping("/tableMeta/{tableId}")
    @CrossOrigin
    public TableMeta getTableMetaById(@PathVariable("tableId") String tableId) {
        return tableMetaMapper.selectTableMeta(Integer.parseInt(tableId));

    }

    @RequestMapping("/tableData/{tableName}")
    @CrossOrigin
    public Object getTableData(@PathVariable("tableName") String tableName, @RequestBody HashMap<String, String> params) {
        return fetchDataService.fetchData(tableName, params);
    }

}
