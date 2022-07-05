package com.example.rpc.codec;

/**
 * @author ZhongWan
 * @description 反序列化
 * @date 2022-07-04 18:43
 */
public interface Decoder {
    <T> T decode(byte[] bytes, Class<T> clazz);
}
