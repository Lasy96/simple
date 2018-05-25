package com.yhl.service.impl;

import com.yhl.model.dao.UserDao;
import com.yhl.model.entity.User;
import com.yhl.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Lasy
 * @date 2018/5/24 16:30
 */
@Service("userService")
public class UserService implements UserServiceI {
    @Autowired
    private UserDao dao;

    @Override
    public User getId(Integer id) {
        return dao.getId(id);
    }
}
