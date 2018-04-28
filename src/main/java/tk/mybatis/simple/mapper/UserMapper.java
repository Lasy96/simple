package tk.mybatis.simple.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;
import tk.mybatis.simple.model.entity.User;
import tk.mybatis.simple.model.rest.param.Page;

public interface UserMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    @Results(id = "userResultMap", value = {
            @Result(property = "id", column="id", id = true),
            @Result(property = "userName", column = "user_name" ),
            @Result(property = "password", column = "password" ),
            @Result(property = "mail", column = "mail" ),
            @Result(property = "intro", column = "intro" ),
            @Result(property = "headPortrait", column = "head_portrait" ),
            @Result(property = "createTime", column = "create_time" ),
            @Result(property = "updateTime", column = "update_time" )
    })
    @Select("SELECT * FROM user WHERE id = #{id}")
    User selectByPrimaryKey(Integer id);

    @ResultMap("userResultMap")
    @Select("select * from user")
    List<User> selectAll();
    List<User> selectAll(RowBounds rowBounds);

    int updateByPrimaryKey(User record);

    List<User> findPage(Page<User> page);
}