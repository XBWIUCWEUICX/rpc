package com.example.rpc.codec;

import junit.framework.TestCase;

/**
 * @author ZhongWan
 * @description TODO
 * @date 2022-07-04 21:39
 */
public class JSONDcoderTest extends TestCase {

    public void testDecode() {
        Encoder encoder = new JSONEncoder();

        TestBean bean = new TestBean();
        bean.setAge(18);
        bean.setName("rpc");

        byte[] bytes = encoder.encode(bean);

        Decoder decoder = new JSONDcoder();
        TestBean bean2 = decoder.decode(bytes, TestBean.class);

        assertEquals(bean.getName(), bean2.getName());
        assertEquals(bean.getAge(), bean2.getAge());

    }
}