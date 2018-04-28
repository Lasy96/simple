package tk.mybatis.simple.mapper;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tk.mybatis.simple.BaseMapperTest;
import tk.mybatis.simple.interceptor.PageRowBounds;
import tk.mybatis.simple.model.entity.User;
import tk.mybatis.simple.model.rest.param.Page;

import java.util.List;

/**
 * Created by hxh
 * 2018/3/27.
 */
public class UserMapperTest extends BaseMapperTest {

    @Test
    public void testSelectAll() {
        SqlSession sqlSession = getSqlSession();
        try {
            //获取UserMapper接口
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            RowBounds rowBounds = new RowBounds(0, 1);
            List<User> list = userMapper.selectAll(rowBounds);
            list.forEach(user -> {
                System.out.println(user.getUserName());
            });
            PageRowBounds pageRowBounds = new PageRowBounds(0, 1);
            list = userMapper.selectAll(pageRowBounds);
            System.out.println("查询总数" + pageRowBounds.getTotal());
            list.forEach(user -> {
                System.out.println(user.getUserName());
            });
            pageRowBounds = new PageRowBounds(2, 1);
            list = userMapper.selectAll(pageRowBounds);
            System.out.println("查询总数" + pageRowBounds.getTotal());
            list.forEach(user -> {
                System.out.println(user.getUserName());
            });
        } finally {
            sqlSession.close();
        }
    }
}
