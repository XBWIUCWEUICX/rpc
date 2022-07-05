package com.example.rpc.server;

import com.example.rpc.codec.Decoder;
import com.example.rpc.codec.Encoder;
import com.example.rpc.codec.JSONDcoder;
import com.example.rpc.codec.JSONEncoder;
import com.example.rpc.transport.HttpTransportServer;
import com.example.rpc.transport.TransportServer;
import lombok.Data;

/**
 * @author ZhongWan
 * @description Server配置
 * @date 2022-07-05 10:16
 */
@Data
public class RpcServerConfig {
    private Class<? extends TransportServer> transportClass = HttpTransportServer.class;
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDcoder.class;
    private int port = 3000;
}
