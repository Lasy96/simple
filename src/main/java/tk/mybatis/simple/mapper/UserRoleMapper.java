package tk.mybatis.simple.mapper;

import java.util.List;
import tk.mybatis.simple.model.entity.UserRole;

public interface UserRoleMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(UserRole record);

    UserRole selectByPrimaryKey(Integer id);

    List<UserRole> selectAll();

    int updateByPrimaryKey(UserRole record);
}