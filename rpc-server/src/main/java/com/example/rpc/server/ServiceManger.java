package com.example.rpc.server;

import com.example.rpc.Request;
import com.example.rpc.ServiceDescriptor;
import com.example.rpc.common.utils.ReflectionUtils;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ZhongWan
 * @description 管理rpc暴露的服务
 * @date 2022-07-05 10:25
 */
@Slf4j
public class ServiceManger {
    private Map<ServiceDescriptor, ServiceInstance> services;

    public ServiceManger(){
        this.services = new ConcurrentHashMap<>();
    }

    public <T> void register(Class<T> interfaceClass, T bean){
        Method[] methods = ReflectionUtils.getPublicMethods(interfaceClass);
        for (Method method : methods){
            ServiceInstance sis = new ServiceInstance(bean, method);
            ServiceDescriptor sdp = ServiceDescriptor.from(interfaceClass, method);

            services.put(sdp, sis);
            log.info("register service: {} {}", sdp.getClazz(), sdp.getMethod());
        }
    }

    public ServiceInstance lookup(Request request){
        ServiceDescriptor sdp = request.getService();
        return services.get(sdp);
    }
}
