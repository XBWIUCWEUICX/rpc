package com.example.rpc.demo;

import com.example.rpc.server.RpcServer;

/**
 * @author ZhongWan
 * @description TODO
 * @date 2022-07-05 14:52
 */
public class Server {
    public static void main(String[] args) {
        RpcServer server = new RpcServer();

        server.register(CalcService.class, new CalcServiceImpl());
        server.start();
    }
}
