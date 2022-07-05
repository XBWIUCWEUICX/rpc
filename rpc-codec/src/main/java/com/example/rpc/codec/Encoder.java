package com.example.rpc.codec;

/**
 * @author ZhongWan
 * @description 序列化
 * @date 2022-07-04 18:42
 */
public interface Encoder {
    byte[] encode(Object obj);
}
