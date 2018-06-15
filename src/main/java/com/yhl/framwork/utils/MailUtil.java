package com.yhl.framwork.utils;


import com.yhl.utilConstant.MailConstant;

import javax.mail.*;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * @author Lasy
 * @date 2018/6/1 15:56
 */
public class MailUtil {
    /**
     * 发送邮件
     *
     * @param to    目标邮箱地址
     * @param text  内容
     * @param title 标题
     * @throws MessagingException
     */
    public static void sendMail(String to, String text, String title) throws MessagingException {
        Properties properties = new Properties();
        // 表示SMTP发送邮件，必须进行身份验证
        properties.put("mail.smtp.auth", "true");
        // SMTP服务器
        properties.put("mail.smtp.host", MailConstant.HOST);
        // 端口号
        properties.put("mail.smtp.port", MailConstant.PORT);
        // 账号
        properties.put("mail.user", MailConstant.USER);
        // 16位STMP口令
        properties.put("mail.password", MailConstant.PASSWORD);
        // 构建授权信息，用于进行SMTP进行身份验证
        Authenticator authenticator = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                // 用户名和密码
                return new PasswordAuthentication(MailConstant.USER, MailConstant.PASSWORD);
            }
        };
        // 使用环境属性和授权信息，创建邮件会话
        Session mailSession = Session.getInstance(properties, authenticator);
        // 创建邮件消息
        MimeMessage message = new MimeMessage(mailSession);
        // 设置发件人
        message.setFrom(new InternetAddress(MailConstant.USER));
        // 设置收件人的邮箱
        message.setRecipient(RecipientType.TO, new InternetAddress(to));
        // 设置邮件标题
        message.setSubject(title);
        // 设置邮件的内容体
        message.setContent(text, "text/html;charset=UTF-8");
        // 发送邮件
        Transport.send(message);
    }
}
