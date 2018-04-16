package tk.mybatis.simple.mapper;

import tk.mybatis.simple.model.entity.UserRole;

import java.util.List;

public interface UserRoleServiceI {

    int deleteByPrimaryKey(Integer id);

    int insert(UserRole record);

    UserRole selectByPrimaryKey(Integer id);

    List<UserRole> selectAll();

    int updateByPrimaryKey(UserRole record);
}