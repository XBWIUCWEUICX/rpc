package com.example.rpc.demo;

import com.example.rpc.client.RpcClient;

/**
 * @author ZhongWan
 * @description TODO
 * @date 2022-07-05 14:52
 */
public class Client {

    public static void main(String[] args) {
        RpcClient client = new RpcClient();
        CalcService service = client.getProxy(CalcService.class);

        int r1 = service.add(1, 2);
        int r2 = service.minus(10, 8);

        System.out.println(r1);
        System.out.println(r2);
    }
}
