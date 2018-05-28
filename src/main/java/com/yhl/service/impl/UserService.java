package com.yhl.service.impl;

import com.alibaba.dubbo.rpc.exception.DubboException;
import com.yhl.framwork.utils.MD5Util;
import com.yhl.framwork.utils.MathUtil;
import com.yhl.model.dao.UserDao;
import com.yhl.model.entity.User;
import com.yhl.rest.param.UserParam;
import com.yhl.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

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
    public void register(UserParam param) {
        Assert.notNull(param, "参数不能为空!");
        Assert.notNull(param.getUserName(), "用户名不能为空!");
        Assert.notNull(param.getPassword(), "密码不能为空!");
        Assert.notNull(param.getPasswordAgain(), "二次密码不能为空!");
        if (!param.getPasswordAgain().equals(param.getPassword())) {
            throw new DubboException("两次密码不一致!");
        }
        Integer getName = dao.getName(param.getUserName());
        if (getName > 0) {
            throw new DubboException("用户名已存在!");
        }
        User user = new User();
        user.setUserName(param.getUserName());
        user.setSalt(MathUtil.getRandomString(6));
        user.setPassword(MD5Util.getMD5ofStr(param.getPassword() + user.getSalt()));
        user.setCreateTime(new Date());
        dao.register(user);
    }

    @Override
    public User getId(Integer id) {
        return dao.getId(id);
    }
}
