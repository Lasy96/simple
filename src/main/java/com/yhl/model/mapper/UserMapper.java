package com.yhl.model.mapper;

import com.yhl.model.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User getId(@Param("id") Integer id);

    /**
     * 根据用户名查询
     *
     * @param name 用户名
     * @return 记录
     */
    int getName(@Param("name") String name);

    /**
     * 注册
     * @param user 用户参数
     */
    void register(@Param("user") User user);

    User getByName(String name);
}