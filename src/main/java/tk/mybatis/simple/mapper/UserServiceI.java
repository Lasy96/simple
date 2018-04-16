package tk.mybatis.simple.mapper;

import tk.mybatis.simple.model.entity.User;

import java.util.List;

public interface UserServiceI {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}