package com.yhl.rest.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author Lasy
 * @date 2018/5/29 15:25
 */
@ApiModel("登录参数")
public class LoginParam implements Serializable {
    @ApiModelProperty("用户名")
    private String nikeName;
    @ApiModelProperty("密码")
    private String password;

    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
 