package tk.mybatis.simple.mapper;

import java.util.List;
import tk.mybatis.simple.model.entity.Role;

public interface RoleMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    Role selectByPrimaryKey(Integer id);

    List<Role> selectAll();

    int updateByPrimaryKey(Role record);
}