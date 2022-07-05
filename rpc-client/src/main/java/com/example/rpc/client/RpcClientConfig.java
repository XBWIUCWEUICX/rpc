package com.example.rpc.client;

import com.example.rpc.Peer;
import com.example.rpc.codec.Decoder;
import com.example.rpc.codec.Encoder;
import com.example.rpc.codec.JSONDcoder;
import com.example.rpc.codec.JSONEncoder;
import com.example.rpc.transport.HTTPTransportClient;
import com.example.rpc.transport.TransportClient;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

/**
 * @author ZhongWan
 * @description TODO
 * @date 2022-07-05 11:01
 */
@Data
public class RpcClientConfig {
    private Class<? extends TransportClient> transportClass = HTTPTransportClient.class;
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDcoder.class;
    private Class<? extends TransportSelector> selectorClass = RandomTransportSelector.class;
    private int connectCount = 1;
    private List<Peer> servers = Arrays.asList(
            new Peer("127.0.0.1", 3000)
    );
}
