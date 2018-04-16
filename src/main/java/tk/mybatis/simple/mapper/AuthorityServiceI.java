package tk.mybatis.simple.mapper;

import tk.mybatis.simple.model.entity.Authority;

import java.util.List;

public interface AuthorityServiceI {

    int deleteByPrimaryKey(Integer id);

    int insert(Authority record);

    Authority selectByPrimaryKey(Integer id);

    List<Authority> selectAll();

    int updateByPrimaryKey(Authority record);
}