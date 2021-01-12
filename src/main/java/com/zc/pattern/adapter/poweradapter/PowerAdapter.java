package com.zc.pattern.adapter.poweradapter;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/12 11:41
 * @description:
 */
public class PowerAdapter implements DC5 {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用PowerAdapter输入AC:" + adapterInput + "V,输出DC:" + adapterOutput + "V");
        return adapterOutput;
    }
}
