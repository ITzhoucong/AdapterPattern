package com.zc.pattern.adapter.loginadapter.v1;

import com.zc.pattern.adapter.loginadapter.v1.ResultMsg;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/12 11:51
 * @description: 原有的登录注册逻辑
 */
public class SinginService {

    /**
     * 注册方法
     */
    public ResultMsg regist(String username,String password){
        return new ResultMsg(200,"注册成功",null);
    }

    /**
     * 登录方法
     */
    public ResultMsg login(String username,String password){
        return new ResultMsg(200,"登录成功",null);
    }
}
