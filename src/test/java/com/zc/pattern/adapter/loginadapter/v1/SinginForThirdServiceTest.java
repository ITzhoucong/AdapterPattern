package com.zc.pattern.adapter.loginadapter.v1;

/**
 * @author: ZhouCong
 * @date: Create in 2021/1/12 12:11
 * @description:
 */
public class SinginForThirdServiceTest {
    public static void main(String[] args) {
        SinginForThirdService singinForThirdService = new SinginForThirdService();
        singinForThirdService.login("zc","123456");
        singinForThirdService.loginForQQ("fadfafd");
        singinForThirdService.loginForWechat("fdsaf");

    }
}
