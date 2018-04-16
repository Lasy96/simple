package tk.mybatis.simple.mapper;

import tk.mybatis.simple.model.entity.RoleAuthority;

import java.util.List;

public interface RoleAuthorityServiceI {

    int deleteByPrimaryKey(Integer id);

    int insert(RoleAuthority record);

    RoleAuthority selectByPrimaryKey(Integer id);

    List<RoleAuthority> selectAll();

    int updateByPrimaryKey(RoleAuthority record);
}