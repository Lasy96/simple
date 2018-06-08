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

//    public static void main(String[] args) {
//        try {
//                MailUtil.sendMail("lasyer@foxmail.com", "一个文本", "");
//                System.out.println("成功");
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
//    }

    /**
     * 0出现的概率为%50
     */
    public static double rate0 = 0.50;
    /**
     * 1出现的概率为%20
     */
    public static double rate1 = 0.20;
    /**
     * 2出现的概率为%15
     */
    public static double rate2 = 0.15;
    /**
     * 3出现的概率为%10
     */
    public static double rate3 = 0.10;
    /**
     * 4出现的概率为%4
     */
    public static double rate4 = 0.04;
    /**
     * 5出现的概率为%1
     */
    public static double rate5 = 0.01;

    /**
     * Math.random()产生一个double型的随机数，判断一下
     * 例如0出现的概率为%50，则介于0到0.50中间的返回0
     *
     * @return int
     */
    private int PercentageRandom() {
        Double randomNumber = Math.random();
        if (randomNumber >= 0 && randomNumber <= rate0) {
            return 0;
        } else if (randomNumber <= rate0 + rate1) {
            return 1;
        } else if (randomNumber >= rate0 + rate1
                && randomNumber <= rate0 + rate1 + rate2) {
            return 2;
        } else if (randomNumber >= rate0 + rate1 + rate2
                && randomNumber <= rate0 + rate1 + rate2 + rate3) {
            return 3;
        } else if (randomNumber >= rate0 + rate1 + rate2 + rate3
                && randomNumber <= rate0 + rate1 + rate2 + rate3 + rate4) {
            return 4;
        } else if (randomNumber >= rate0 + rate1 + rate2 + rate3 + rate4
                && randomNumber <= rate0 + rate1 + rate2 + rate3 + rate4
                + rate5) {
            return 5;
        }
        return -1;
    }

    /**
     * 测试主程序
     */
    public static void main(String[] args) {
        LoginParam a = new LoginParam();
        //打印100个测试概率的准确性
        for (int i = 0; i <= 100; i++) {
            System.out.println(a.PercentageRandom());
        }
    }

}
 