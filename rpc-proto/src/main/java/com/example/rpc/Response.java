package com.example.rpc;

import lombok.Data;

/**
 * @author ZhongWan
 * @description 表示rpc的返回
 * @date 2022-07-04 18:13
 */
@Data
public class Response {
    /**
     * 服务返回编码
     * 0-成功 非0失败
     */
    private int code = 0;
    /**
     * 具体的错误信息
     */
    private String message = "ok";
    /**
     * 返回的数据
     */
    private Object data;
}
