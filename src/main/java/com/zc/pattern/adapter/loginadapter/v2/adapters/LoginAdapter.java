package com.zc.pattern.adapter.loginadapter.v2.adapters;

import com.zc.pattern.adapter.loginadapter.v1.ResultMsg;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/12 12:20
 * @description:    在适配器里面这个接口是可无可有的，不要和模板模式混淆，
 *                  模板模式一定是抽象类，而这里面只是一个接口
 */
public interface LoginAdapter {

    /**
     * 适配器兼容性判断
     */
    boolean support(Object adapter);
    /**
     * 登录逻辑
     */
    ResultMsg login(String id,Object a);
}
