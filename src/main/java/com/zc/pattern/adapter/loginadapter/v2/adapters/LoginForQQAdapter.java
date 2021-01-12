package com.zc.pattern.adapter.loginadapter.v2.adapters;

import com.zc.pattern.adapter.loginadapter.v1.ResultMsg;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/12 12:23
 * @description: QQ登录
 */
public class LoginForQQAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    @Override
    public ResultMsg login(String id, Object a) {
//        具体逻辑
        return null;
    }
}
