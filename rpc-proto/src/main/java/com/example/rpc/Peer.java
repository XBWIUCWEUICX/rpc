package com.example.rpc;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ZhongWan
 * @description 表示网络传输的一个端点
 * @date 2022-07-04 18:07
 */
@Data
@AllArgsConstructor
public class Peer {
    private String host;
    private int port;
}
