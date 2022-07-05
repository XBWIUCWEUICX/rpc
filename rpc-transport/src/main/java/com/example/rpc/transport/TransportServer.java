package com.example.rpc.transport;

/**
 * @author ZhongWan
 * @description
 *     1.启动、监听
 *     2.接受请求
 *     3.关闭监听
 * @date 2022-07-04 21:49
 */
public interface TransportServer {
    void init(int port, RequestHandler handler);

    void start();

    void stop();

}
