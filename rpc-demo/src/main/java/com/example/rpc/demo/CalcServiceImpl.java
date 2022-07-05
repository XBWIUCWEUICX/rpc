package com.example.rpc.demo;

/**
 * @author ZhongWan
 * @description TODO
 * @date 2022-07-05 14:54
 */
public class CalcServiceImpl implements CalcService {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int minus(int a, int b) {
        return a - b;
    }
}
