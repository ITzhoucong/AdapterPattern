package com.zc.pattern.adapter.poweradapter;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/12 11:37
 * @description: 220V交流电
 */
public class AC220 {

    public int outputAC220V(){
        int output = 220;
        System.out.println("输出电流" + output + "V");
        return output;
    }
}
