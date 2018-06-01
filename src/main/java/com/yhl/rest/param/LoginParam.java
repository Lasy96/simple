package com.yhl.rest.param;

import com.yhl.framwork.utils.MailUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.mail.MessagingException;
import java.io.Serializable;

/**
 * @author Lasy
 * @date 2018/5/29 15:25
 */
@ApiModel("登录参数")
public class LoginParam implements Serializable {
    @ApiModelProperty("用户名")
    private String userName;
    @ApiModelProperty("密码")
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

    public static void main(String[] args) {
        try {
                MailUtil.sendMail("563189288@qq.com", "一个文本");
                System.out.println("成功");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

}
