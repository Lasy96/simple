package com.test.service;

import com.test.BasicTest;
import com.yhl.rest.param.UserParam;
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
//        service.getId(2);
        UserParam param = new UserParam();
        param.setUserName("和");
        param.setPassword("123456");
        param.setPasswordAgain("123456");
        service.register(param);
    }
}
