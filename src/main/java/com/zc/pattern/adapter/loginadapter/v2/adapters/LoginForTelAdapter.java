package com.zc.pattern.adapter.loginadapter.v2.adapters;

import com.zc.pattern.adapter.loginadapter.v1.ResultMsg;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/12 12:28
 * @description: 手机短信登录
 */
public class LoginForTelAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    @Override
    public ResultMsg login(String id, Object a) {
        return null;
    }
}
