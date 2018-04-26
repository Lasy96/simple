package tk.mybatis.simple.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tk.mybatis.simple.BaseMapperTest;
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
            //调用selectByPrimaryKey方法,查询id为1的用户
//            MyInterceptor myInterceptor = new MyInterceptor();
//            User user = userMapper.selectByPrimaryKey(1);
            Page<User> page = new Page<User>();
            page.setPage(2);
            page.setPageSize(2);
            List<User> userList = userMapper.findPage(page);
            page.setResults(userList);
            System.out.println(page + "是page啊");
        } finally {
            sqlSession.close();
        }
    }
}
