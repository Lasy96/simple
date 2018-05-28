package com.yhl.rest.param;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * @author Lasy
 * @date 2018/5/28 16:21
 */
@ApiModel("用户注册参数")
public class UserParam implements Serializable {
    private String userName;
    private String password;
    private String passwordAgain;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordAgain() {
        return passwordAgain;
    }

    public void setPasswordAgain(String passwordAgain) {
        this.passwordAgain = passwordAgain;
    }
}
