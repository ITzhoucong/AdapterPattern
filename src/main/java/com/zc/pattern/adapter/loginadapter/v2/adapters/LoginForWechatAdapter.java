package com.zc.pattern.adapter.loginadapter.v2.adapters;

import com.zc.pattern.adapter.loginadapter.v1.ResultMsg;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/12 12:30
 * @description: 微信登录
 */
public class LoginForWechatAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }

    @Override
    public ResultMsg login(String id, Object a) {
        return null;
    }
}
