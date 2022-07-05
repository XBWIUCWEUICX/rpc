package com.example.rpc.codec;

import com.alibaba.fastjson.JSON;

/**
 * @author ZhongWan
 * @description 基于JSON的反序列化实现
 * @date 2022-07-04 21:33
 */
public class JSONDcoder implements Decoder {
    @Override
    public <T> T decode(byte[] bytes, Class<T> clazz) {
         return JSON.parseObject(bytes, clazz);
    }
}
