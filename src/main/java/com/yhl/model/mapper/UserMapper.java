package com.yhl.model.mapper;

import com.yhl.model.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    /**
     * 根据id查询用户
     *
     * @param id
     * @return
     */
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
     *
     * @param user 用户参数
     */
    void register(@Param("user") User user);

    /**
     * 根据名称查询用户
     *
     * @param name 用户名
     * @return 用户信息
     */
    User getByName(@Param("name") String name);

    /**
     * 修改密码
     *
     * @param user 用户密码
     */
    void changePassword(@Param("user") User user);
}