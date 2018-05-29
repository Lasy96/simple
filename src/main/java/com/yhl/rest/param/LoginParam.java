package com.yhl.rest.param;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * @author Lasy
 * @date 2018/5/29 15:25
 */
@ApiModel("登录参数")
public class LoginParam implements Serializable {
    private String userName;
    private String password;
    public static void main(String[] args) {
        String stringList = "qweasdasdc,,adzxcdasd";
        String[] stringListSplit = stringList.split(",");
        for (String s : stringListSplit) {
            System.out.println(s);
        }
    }

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
