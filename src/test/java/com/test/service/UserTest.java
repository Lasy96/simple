package com.test.service;

import com.test.BasicTest;
import com.yhl.rest.param.ChangePasswordParam;
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
//        param.setNikeName("郑鹤");
//        param.setPassword("123456");
//        param.setPasswordAgain("123456");
//        service.register(param);
//        LoginParam param = new LoginParam();
//        param.setNikeName("郑和");
//        param.setPassword("123422");
//        service.login(param);
//        ChangePasswordParam param = new ChangePasswordParam();
//        param.setId(15);
//        param.setOldPassword("654321");
//        param.setNewPassword("123456");
//        param.setPasswordAgain("123456");
//        service.changePassword(param);
//        FindPasswordParam param = new FindPasswordParam();
//        param.setNikeName("林中夕阳");
//        param.setMail("1054795648@qq.com");
//        service.sendEmail(param);
        String phone = "18771632488";
        String s = phone.replaceAll("(\\d{3})\\d{6}(\\d{2})","$1******$2");
        System.out.println(s);
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
