package com.zc.pattern.adapter.poweradapter;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/12 11:45
 * @description:
 */
public class PowerAdapterTest {

    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter(new AC220());
        dc5.outputDC5V();
    }
}
