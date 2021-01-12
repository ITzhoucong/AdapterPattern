package com.zc.pattern.adapter.loginadapter.v2;

import com.zc.pattern.adapter.loginadapter.v1.ResultMsg;
import com.zc.pattern.adapter.loginadapter.v2.service.SiginService;
import com.zc.pattern.adapter.loginadapter.v2.adapters.*;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/12 12:18
 * @description: 继承原有业务实现扩展接口  结合策略模式、工厂模式、适配器模式
 */
public class PassportForThirdAdapter extends SiginService implements IPassportForThird {
    @Override
    public ResultMsg loginForQQ(String openId) {
/*      //        适配器不一定要接口
        LoginAdapter adapter = new LoginForQQAdapter();
        if (adapter.support(adapter)){
            return adapter.login(openId,adapter);
        }
        return null;

        */
//        策略模式体现，用户选择不同的逻辑
        return processLogin(openId, LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
     /*   //        适配器不一定要接口
        LoginAdapter adapter = new LoginForWechatAdapter();
        if (adapter.support(adapter)){
            return adapter.login(openId,adapter);
        }
        return null;*/

        //        策略模式体现，用户选择不同的逻辑
        return processLogin(openId, LoginForWechatAdapter.class);
    }

    @Override
    public ResultMsg loginForSina(String openId) {
        //        策略模式体现，用户选择不同的逻辑
        return processLogin(openId, LoginForSinaAdapter.class);
    }

    @Override
    public ResultMsg loginForToken(String token) {

        //        策略模式体现，用户选择不同的逻辑
        return processLogin(token, LoginForTokenAdapter.class);
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        //        策略模式体现，用户选择不同的逻辑
        return processLogin(telphone, LoginForTelAdapter.class);
    }

    @Override
    public ResultMsg loginForRegister(String username, String passport) {
        super.regist(username, passport);
        return super.login(username, passport);
    }

    /**
     * 简单工厂模式使用，简化代码，不用每一个登录方式都要写一遍判断并实例化对应的对象
     */
    private ResultMsg processLogin(String key, Class<? extends LoginAdapter> clazz) {
        try {
            //        适配器不一定要接口
            LoginAdapter adapter = clazz.newInstance();
//            判断传过来的适配器是否能处理指定的逻辑
            if (adapter.support(adapter)) {
                return adapter.login(key, adapter);
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
