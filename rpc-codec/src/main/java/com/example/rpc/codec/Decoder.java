package com.example.rpc.codec;

/**
 * @author ZhongWan
 * @description εεΊεε
 * @date 2022-07-04 18:43
 */
public interface Decoder {
    <T> T decode(byte[] bytes, Class<T> clazz);
}
