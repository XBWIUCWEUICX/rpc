package com.example.rpc.common.utils;

import junit.framework.TestCase;

import java.lang.reflect.Method;

/**
 * @author ZhongWan
 * @description TODO
 * @date 2022-07-04 18:33
 */
public class ReflectionUtilsTest extends TestCase {

    public void testNewInstance() {
        TestClass t = ReflectionUtils.newInstance(TestClass.class);
        assertNotNull(t);
    }

    public void testGetPublicMethods() {
        Method[] methods = ReflectionUtils.getPublicMethods(TestClass.class);
        assertEquals(1, methods.length);

        String mname = methods[0].getName();
        assertEquals("b", mname);
    }

    public void testInvoke() {
        Method[] methods = ReflectionUtils.getPublicMethods(TestClass.class);
        Method b = methods[0];

        TestClass t = new TestClass();
        Object r = ReflectionUtils.invoke(t, b);

        assertEquals("b", r);
    }
}