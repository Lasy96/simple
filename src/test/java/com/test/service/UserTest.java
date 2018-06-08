package com.test.service;

import com.test.BasicTest;
import com.yhl.rest.param.ChangePasswordParam;
import com.yhl.rest.param.FindPasswordParam;
import com.yhl.rest.param.LoginParam;
import com.yhl.rest.param.RegisterParam;
import com.yhl.service.UserServiceI;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Lasy
 * @date 2018/5/25 14:19
 */
public class UserTest extends BasicTest {
    @Autowired
    private UserServiceI service;

    @Test
    public void test() {
//        RegisterParam param = new RegisterParam();
//        param.setUserName("郑鹤");
//        param.setPassword("123456");
//        param.setPasswordAgain("123456");
//        service.register(param);
//        LoginParam param = new LoginParam();
//        param.setUserName("郑和");
//        param.setPassword("123422");
//        service.login(param);
//        ChangePasswordParam param = new ChangePasswordParam();
//        param.setId(22);
//        param.setOldPassword("654321");
//        param.setNewPassword("654321");
//        param.setPasswordAgain("654321");
//        service.changePassword(param);
        FindPasswordParam param = new FindPasswordParam();
        param.setName("46157897897546437866456789987913456");
        param.setMail("522211279657125468797456898@qq.com");
        service.sendEmail(param);
    }
}
