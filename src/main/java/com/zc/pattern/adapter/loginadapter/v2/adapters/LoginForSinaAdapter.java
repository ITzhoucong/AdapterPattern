package com.zc.pattern.adapter.loginadapter.v2.adapters;

import com.zc.pattern.adapter.loginadapter.v1.ResultMsg;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/12 12:26
 * @description: 新浪登录
 */
public class LoginForSinaAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForSinaAdapter;
    }

    @Override
    public ResultMsg login(String id, Object a) {
        return null;
    }
}
