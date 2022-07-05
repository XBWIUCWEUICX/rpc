package com.example.rpc.codec;

import com.alibaba.fastjson.JSON;
/**
 * @author ZhongWan
 * @description 基于json的序列化实现
 * @date 2022-07-04 18:45
 */
public class JSONEncoder implements Encoder {
    @Override
    public byte[] encode(Object obj) {
        return JSON.toJSONBytes(obj);
    }
}
