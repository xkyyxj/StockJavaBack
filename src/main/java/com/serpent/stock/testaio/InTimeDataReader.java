package com.serpent.stock.testaio;

import com.serpent.stock.mapper.StockListMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.channels.AsynchronousSocketChannel;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class InTimeDataReader {
    public static final String SINA_TIME = "";

    @Autowired
    StockListMapper listMapper;

    public void initialize() {
        List<String> allCodes = listMapper.selectAllTsCodes();
    }

    public void fetch() throws IOException, ExecutionException, InterruptedException {
        StringBuilder builder = new StringBuilder();
        builder.append("GET /list=sz000001 HTTP/1.1\r\n");
        builder.append("Host: localhost:8088\r\n");
        builder.append("Connection: Keep-Alive\r\n");
        InetAddress[] addresses = InetAddress.getAllByName(SINA_TIME);
        AsynchronousSocketChannel channel = AsynchronousSocketChannel.open();
        for(InetAddress address : addresses) {
            InetSocketAddress socketAddress = new InetSocketAddress(address, 80);
            channel.connect(socketAddress).get();
            break;
        }
        //channel.write()

    }

}
