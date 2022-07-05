package com.example.rpc.server;

import com.example.rpc.Request;
import com.example.rpc.common.utils.ReflectionUtils;

/**
 * @author ZhongWan
 * @description 调用具体服务
 * @date 2022-07-05 15:23
 */
public class ServiceInvoker {
    public Object invoke(ServiceInstance service, Request request){
        return ReflectionUtils.invoke(service.getTarget(), service.getMethod(),
                request.getParameters());
    }
}
