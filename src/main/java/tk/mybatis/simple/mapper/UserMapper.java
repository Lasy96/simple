package tk.mybatis.simple.mapper;

import java.util.List;
import tk.mybatis.simple.model.entity.User;
import tk.mybatis.simple.model.rest.param.UserParam;

public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}