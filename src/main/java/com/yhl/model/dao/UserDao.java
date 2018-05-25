package com.yhl.model.dao;

import com.yhl.model.entity.User;
import com.yhl.model.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
}
