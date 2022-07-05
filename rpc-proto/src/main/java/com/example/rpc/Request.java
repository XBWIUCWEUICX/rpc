package com.example.rpc;

import lombok.Data;

/**
 * @author ZhongWan
 * @description 表示rpc的一个请求
 * @date 2022-07-04 18:12
 */
@Data

public class Request {
    private ServiceDescriptor service;
    private Object[] parameters;
}
