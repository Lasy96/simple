package com.yhl.framwork.utils;


import com.yhl.utilConstant.MailConstant;

import javax.mail.*;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * @author 袁华
 * @date 2018/6/1 15:56
 */
public class MailUtil {
    public static void sendMail(String to, String text) throws MessagingException {
        Properties properties = new Properties();
        // 表示SMTP发送邮件，必须进行身份验证
        properties.put("mail.smtp.auth", "true");
        // SMTP服务器
        properties.put("mail.smtp.host", "smtp.qq.com");
        //端口号，QQ邮箱给出了两个端口，但是另一个我一直使用不了，所以就给出这一个587
        properties.put("mail.smtp.port", "587");
        // 账号
        properties.put("mail.user", MailConstant.user);
        // 16位STMP口令
        properties.put("mail.password", MailConstant.password);
        // 构建授权信息，用于进行SMTP进行身份验证
        Authenticator authenticator = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                // 用户名和密码
                return new PasswordAuthentication(MailConstant.user, MailConstant.password);
            }
        };
        // 使用环境属性和授权信息，创建邮件会话
        Session mailSession = Session.getInstance(properties, authenticator);
        // 创建邮件消息
        MimeMessage message = new MimeMessage(mailSession);
        // 设置发件人
        message.setFrom(new InternetAddress(MailConstant.user));
        // 设置收件人的邮箱
        message.setRecipient(RecipientType.TO, new InternetAddress(to));
        // 设置邮件标题
        message.setSubject("测试邮件");
        // 设置邮件的内容体
        message.setContent(text, "text/html;charset=UTF-8");
        // 发送邮件
        Transport.send(message);
    }
}
