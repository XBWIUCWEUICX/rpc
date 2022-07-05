package com.example.rpc.server;

import com.example.rpc.Request;
import com.example.rpc.ServiceDescriptor;
import com.example.rpc.common.utils.ReflectionUtils;
import junit.framework.TestCase;
import org.junit.Before;

import java.lang.reflect.Method;

/**
 * @author ZhongWan
 * @description TODO
 * @date 2022-07-05 15:05
 */
public class ServiceMangerTest extends TestCase {
    ServiceManger sm;

    @Before
    public void init(){
        sm = new ServiceManger();
        TestInterface bean = new TestClass();

        sm.register(TestInterface.class, bean);
    }

    public void testRegister() {
        TestInterface bean = new TestClass();

        sm.register(TestInterface.class, bean);
    }

    public void testLookup() {
        Method method = ReflectionUtils.getPublicMethods(TestInterface.class)[0];

        ServiceDescriptor sdp = ServiceDescriptor.from(TestInterface.class, method);

        Request request = new Request();
        request.setService(sdp);

        ServiceInstance sis = sm.lookup(request);
        assertNotNull(sis);
    }
}