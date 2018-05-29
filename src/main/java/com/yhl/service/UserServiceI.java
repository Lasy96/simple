package com.yhl.service;

import com.yhl.model.entity.User;
import com.yhl.rest.param.LoginParam;
import com.yhl.rest.param.RegisterParam;

/**
 * @author Lasy
 * @date 2018/5/24 15:47
 */
public interface UserServiceI {
    /**
     * 注册
     *
     * @param param 用户注册参数
     */
    void register(RegisterParam param);

    User login(LoginParam param);

    /**
     * 根据id查询用户
     *
     * @param id 用户id
     * @return 用户信息
     */
    User getId(Integer id);
}
