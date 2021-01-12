package com.zc.pattern.adapter.loginadapter.v1;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/12 11:58
 * @description:
 */
public class SinginForThirdService extends SinginService {

    public ResultMsg loginForQQ(String openId) {
//        1、openId是全局唯一，我们可以把它当做是一个用户名（加长）
//        2、密码默认为QQ_EMPTY
//        3、注册（在原有系统里面创建一个用户）
//        4、调用原来的登录方法
        return loginForRegist(openId,null);

    }

    public ResultMsg loginForWechat(String openId){
        return null;
    }
    public ResultMsg loginForToken(String token){
//        通过token拿到用户信息，然后再重新登录了一次
        return null;
    }
    public ResultMsg loginForTelphone(String telphone,String code){
        return null;
    }


    /**
     * qq登录自动注册
     */
    public ResultMsg loginForRegist(String username,String password){
        super.regist(username,null);
        return super.login(username,null);
    }


}
