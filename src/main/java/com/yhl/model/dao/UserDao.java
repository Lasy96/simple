package com.yhl.model.dao;

import com.yhl.model.entity.User;
import com.yhl.model.mapper.UserMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Lasy
 * @date 2018/5/24 16:30
 */

@Component
public class UserDao {
    @Resource
    private UserMapper mapper;

    public User getId(Integer id) {
        return mapper.getId(id);
    }

    public int getName(String name) {
        return mapper.getName(name);
    }

    public void register(User user) {
        mapper.register(user);
    }

    public User getByName(String name) {
        return mapper.getByName(name);
    }

    public void changePassword(User user) {
        mapper.changePassword(user);
    }
}
