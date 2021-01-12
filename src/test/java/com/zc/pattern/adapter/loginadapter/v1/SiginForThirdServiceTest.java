package com.zc.pattern.adapter.loginadapter.v1;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/12 12:11
 * @description:
 */
public class SiginForThirdServiceTest {
    public static void main(String[] args) {
        SiginForThirdService siginForThirdService = new SiginForThirdService();
        siginForThirdService.login("zc","123456");
        siginForThirdService.loginForQQ("fadfafd");
        siginForThirdService.loginForWechat("fdsaf");

    }
}
