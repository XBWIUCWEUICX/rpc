package com.example.rpc.transport;

import com.example.rpc.Peer;

import java.io.InputStream;

/**
 * @author ZhongWan
 * @description
 *      1. 创建连接
 *      2.发送数据，并且等待响应
 *      3.关闭连接
 * @date 2022-07-04 21:45
 */
public interface TransportClient {
    void connect(Peer peer);

    InputStream write(InputStream data);

    void close();

}
