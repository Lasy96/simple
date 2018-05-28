package com.yhl.service;

import com.yhl.model.entity.User;
import com.yhl.rest.param.UserParam;

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
    void register(UserParam param);

    /**
     * 根据id查询用户
     *
     * @param id 用户id
     * @return 用户信息
     */
    User getId(Integer id);
}
