package tk.mybatis.simple.mapper;

import java.util.List;
import tk.mybatis.simple.model.entity.RoleAuthority;

public interface RoleAuthorityMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(RoleAuthority record);

    RoleAuthority selectByPrimaryKey(Integer id);

    List<RoleAuthority> selectAll();

    int updateByPrimaryKey(RoleAuthority record);
}