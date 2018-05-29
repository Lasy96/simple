package com.yhl.rest.param;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * @author Lasy
 * @date 2018/5/29 17:32
 */
@ApiModel("修改密码参数")
public class ChangePasswordParam implements Serializable {
    private Integer id;
    private String oldPassword;
    private String newPassword;
    private String passwordAgain;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getPasswordAgain() {
        return passwordAgain;
    }

    public void setPasswordAgain(String passwordAgain) {
        this.passwordAgain = passwordAgain;
    }
}
