package tk.mybatis.simple.mapper;

import tk.mybatis.simple.model.entity.Role;

import java.util.List;

public interface RoleServiceI {

    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    Role selectByPrimaryKey(Integer id);

    List<Role> selectAll();

    int updateByPrimaryKey(Role record);
}