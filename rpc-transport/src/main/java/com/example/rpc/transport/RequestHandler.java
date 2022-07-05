package com.example.rpc.transport;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author ZhongWan
 * @description 处理网络请求的handler
 * @date 2022-07-04 21:51
 */
public interface RequestHandler {
    void onRequest(InputStream receive, OutputStream toResp);
}
