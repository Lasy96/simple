package com.test.service;

import com.test.BasicTest;
import com.yhl.rest.param.FindPasswordParam;
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
//        param.setName("郑鹤");
//        param.setPassword("123456");
//        param.setPasswordAgain("123456");
//        service.register(param);
//        LoginParam param = new LoginParam();
//        param.setName("郑和");
//        param.setPassword("123422");
//        service.login(param);
//        ChangePasswordParam param = new ChangePasswordParam();
//        param.setId(22);
//        param.setOldPassword("654321");
//        param.setNewPassword("654321");
//        param.setPasswordAgain("654321");
//        service.changePassword(param);
        FindPasswordParam param = new FindPasswordParam();
        param.setName("23123213213");
        param.setMail("12312321312332313@qq.com");
        service.sendEmail(param);
    }



    public static void main(String[] args) {
        int line = 6;
        for (int i = 0; i < line - 1; i++) {
            for (int j = 0; j < line - 1 - i; j++) {
                System.out.print("1");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
