package com.yhl.service.impl;

import com.alibaba.dubbo.rpc.exception.DubboException;
import com.yhl.framwork.utils.Md5Util;
import com.yhl.framwork.utils.MailUtil;
import com.yhl.framwork.utils.MathUtil;
import com.yhl.model.dao.UserDao;
import com.yhl.model.entity.User;
import com.yhl.rest.param.user.ChangePasswordParam;
import com.yhl.rest.param.user.FindPasswordParam;
import com.yhl.rest.param.user.LoginParam;
import com.yhl.rest.param.user.RegisterParam;
import com.yhl.service.UserServiceI;
import com.yhl.util.MailConstant;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.mail.MessagingException;
import java.util.Date;

/**
 * @author Lasy
 * @date 2018/5/24 16:30
 */
@Service("userService")
public class UserService implements UserServiceI {
    @Autowired
    private UserDao dao;

    @Override
    public void register(RegisterParam param) {
        Assert.notNull(param, "参数不能为空!");
        Assert.notNull(param.getNikeName(), "用户名不能为空!");
        Assert.notNull(param.getPassword(), "密码不能为空!");
        Assert.notNull(param.getPasswordAgain(), "二次密码不能为空!");
        if (!param.getPasswordAgain().equals(param.getPassword())) {
            throw new DubboException("两次密码不一致!");
        }
        Integer getName = dao.getName(param.getNikeName());
        if (getName > 0) {
            throw new DubboException("用户名已注册!");
        }
        User user = new User();
        user.setName(param.getNikeName());
        user.setSalt(MathUtil.getRandomString(6, 1));
        user.setPassword(Md5Util.getMD5ofStr(param.getPassword() + user.getSalt()));
        user.setCreateTime(new Date());
        dao.register(user);
    }

    @Override
    public User login(LoginParam param) {
        Assert.notNull(param, "参数不能为空!");
        Assert.notNull(param.getNikeName(), "账号不能为空!");
        Assert.notNull(param.getPassword(), "密码不能为空!");
        return loginCheckout(param);
    }

    @Override
    public void changePassword(ChangePasswordParam param) {
        Assert.notNull(param, "参数不能为空!");
        Assert.notNull(param.getId(), "用户id不能为空!");
        User getId = getId(param.getId());
        Assert.notNull(param.getOldPassword(), "原密码不能为空!");
        Assert.notNull(param.getNewPassword(), "新密码不能为空!");
        Assert.notNull(param.getPasswordAgain(), "确认密码不能为空!");
        if (!param.getNewPassword().equals(param.getPasswordAgain())) {
            throw new DubboException("两次密码不一致!");
        }
        LoginParam loginParam = new LoginParam();
        loginParam.setNikeName(getId.getNikeName());
        loginParam.setPassword(param.getOldPassword());
        User loginCheckout = loginCheckout(loginParam);
        if (StringUtils.equalsIgnoreCase(loginCheckout.getPassword(), Md5Util.getMD5ofStr(param.getNewPassword() + loginCheckout.getSalt()))) {
            throw new DubboException("密码与最近一次密码相同!");
        }
        User user = new User();
        user.setId(param.getId());
        user.setSalt(MathUtil.getRandomString(6, 1));
        user.setPassword(Md5Util.getMD5ofStr(param.getNewPassword() + user.getSalt()));
        dao.changePassword(user);
    }

    @Override
    public User getId(Integer id) {
        return dao.getId(id);
    }

    /**
     * 获取用户名
     */
    public static String userName = null;

    @Override
    public FindPasswordParam findPasswordOne(FindPasswordParam param) {
        Assert.notNull(param, "参数不能为空!");
        Assert.notNull(param.getNikeName(), "用户名不能为空!");
        Assert.notNull(param.getMail(), "邮箱不能为空!");
        User user = dao.getByName(param.getNikeName());
        if (user == null) {
            throw new DubboException("用户不存在!");
        }
        if ("".equals(user.getMail()) || !user.getMail().equals(param.getMail())) {
            throw new DubboException("邮箱不正确!");
        }
        Assert.notNull(param.getCode(), "验证码不能为空!");
        if (!MailConstant.code.equals(param.getCode())) {
            throw new DubboException("验证码错误!");
        }
        param.setId(user.getId());
        return param;
    }

    /**
     * 邮箱验证
     *
     * @param param 找回密码参数
     */
    @Override
    public void sendEmail(FindPasswordParam param) {
        Assert.notNull(param, "参数不能为空!");
        Assert.notNull(param.getNikeName(), "用户名不能为空!");
        Assert.notNull(param.getMail(), "邮箱不能为空!");
        User user = dao.getByName(param.getNikeName());
        if (user == null) {
            throw new DubboException("用户不存在!");
        }
        if ("".equals(user.getMail())) {
            throw new DubboException("该用户没有绑定邮箱!");
        }
        if (!user.getMail().equals(param.getMail())) {
            throw new DubboException("邮箱不正确!");
        }
        userName = user.getName();
        try {
            MailUtil.sendMail(param.getMail(), MailConstant.CONTENT, "林中夕阳");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void findPasswordTwo(FindPasswordParam param) {
        Assert.notNull(param, "参数不能为空!");
        Assert.notNull(param.getPassword(), "密码不能为空!");
        Assert.notNull(param.getPasswordAgain(), "二次密码不能为空!");
        if (param.getPassword().equals(param.getPasswordAgain())) {
            throw new DubboException("两次密码不一致!");
        }
        User user = new User();
        user.setId(param.getId());
        user.setSalt(MathUtil.getRandomString(6, 1));
        user.setPassword(Md5Util.getMD5ofStr(param.getPassword() + user.getSalt()));
        dao.changePassword(user);
    }

    private User loginCheckout(LoginParam param) {
        User user = dao.getByName(param.getNikeName());
        if (user == null) {
            throw new DubboException("用户不存在!");
        }
        if (!StringUtils.equalsIgnoreCase(user.getPassword(), Md5Util.getMD5ofStr(param.getPassword() + user.getSalt()))) {
            throw new DubboException("密码错误!");
        }
        return user;
    }
}
