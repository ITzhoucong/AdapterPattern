package com.zc.pattern.adapter.loginadapter.v2;

import com.zc.pattern.adapter.loginadapter.v1.ResultMsg;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/12 12:13
 * @description: 只扩展的接口
 */
public interface IPassportForThird {

    /**
     * QQ登录
     */
    ResultMsg loginForQQ(String openId);

    /**
     * 微信登录
     */
    ResultMsg loginForWechat(String openId);

    /**
     * 新浪登录
     */
    ResultMsg loginForSina(String openId);

    /**
     * token登录
     */
    ResultMsg loginForToken(String token);

    /**
     * 手机验证登录
     */
    ResultMsg loginForTelphone(String telphone,String code);

    /**
     * 注册账号后自动登录
     */
    ResultMsg loginForRegister(String username,String passport);


}
