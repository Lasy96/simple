package tk.mybatis.simple.mapper;

import java.util.List;
import tk.mybatis.simple.model.entity.Authority;

public interface AuthorityMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Authority record);

    Authority selectByPrimaryKey(Integer id);

    List<Authority> selectAll();

    int updateByPrimaryKey(Authority record);
}