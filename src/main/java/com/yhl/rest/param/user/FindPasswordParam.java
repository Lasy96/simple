package com.yhl.rest.param.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author Lasy
 * @date 2018/5/31 16:53
 */
@ApiModel("找回密码")
public class FindPasswordParam implements Serializable {
    @ApiModelProperty("用户id")
    private Integer id;
    @ApiModelProperty("用户名")
    private String nikeName;
    @ApiModelProperty("邮箱")
    private String mail;
    @ApiModelProperty("验证码")
    private String code;
    @ApiModelProperty("新密码")
    private String password;
    @ApiModelProperty("二次密码")
    private String passwordAgain;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
