package tk.mybatis.simple.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tk.mybatis.simple.BaseMapperTest;
import tk.mybatis.simple.model.entity.User;

import java.util.Date;
import java.util.List;

/**
 * Created by hxh
 * 2018/3/27.
 */
public class UserMapperTest extends BaseMapperTest {
    SqlSession sqlSession = getSqlSession();

    @Test
    public void testSelectAll() {
        try {
            UserServiceI userMapper = sqlSession.getMapper(UserServiceI.class);
            List<User> userList = userMapper.selectAll();
        } finally {
            sqlSession.close();
        }
    }
}
