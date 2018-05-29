package com.yhl.rest.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author Lasy
 * @date 2018/5/28 16:21
 */
@ApiModel("用户注册参数")
public class RegisterParam implements Serializable {
    @ApiModelProperty("用户名")
    private String userName;
    @ApiModelProperty("密码")
    private String password;
    @ApiModelProperty("第二次密码")
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