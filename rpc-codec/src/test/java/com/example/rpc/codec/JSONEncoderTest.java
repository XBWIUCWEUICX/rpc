package com.example.rpc.codec;

import junit.framework.TestCase;

/**
 * @author ZhongWan
 * @description TODO
 * @date 2022-07-04 21:35
 */
public class JSONEncoderTest extends TestCase {

    public void testEncode() {
        Encoder encoder = new JSONEncoder();

        TestBean bean = new TestBean();
        bean.setAge(18);
        bean.setName("rpc");

        byte[] bytes = encoder.encode(bean);
        assertNotNull(bytes);
    }
}