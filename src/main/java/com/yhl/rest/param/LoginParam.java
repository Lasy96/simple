package com.yhl.rest.param;

import java.io.Serializable;

/**
 * @author Lasy
 * @date 2018/5/29 15:25
 */
public class LoginParam implements Serializable {
    private String userName;
    private String password;

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
}
