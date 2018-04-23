package tk.mybatis.simple.mapper;

import junit.framework.Assert;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tk.mybatis.simple.BaseMapperTest;
import tk.mybatis.simple.model.entity.User;

/**
 * Created by hxh
 * 2018/3/27.
 */
public class UserMapperTest extends BaseMapperTest {


    @Test
    public void testSelectAll() {
        SqlSession sqlSession = getSqlSession();
        User user1 = null;
        try {
            //获取UserMapper接口
            UserServiceI userMapper = sqlSession.getMapper(UserServiceI.class);
            //调用selectByPrimaryKey方法,查询id为1的用户
            user1 = userMapper.selectByPrimaryKey(1);
            //对当前对象重新赋值
            user1.setUserName("new name");
            //再次查询获取id相同的用户
            User user2 = userMapper.selectByPrimaryKey(1);
            System.out.println("name -=======> " + user2.getUserName());
            //虽然没有更新数据库,但是这个用户名和user1重新赋值的名字相同
            Assert.assertEquals("new name", user2.getUserName());
            Assert.assertEquals(user1, user2);
        } finally {
            sqlSession.close();
        }
        System.out.println("开启新的");
        sqlSession = getSqlSession();
        try {
            UserServiceI userMapper = sqlSession.getMapper(UserServiceI.class);
            User user2 = userMapper.selectByPrimaryKey(1);
            System.out.println("name -=======> " + user2.getUserName());
            Assert.assertEquals("new name", user2.getUserName());
            Assert.assertEquals(user1, user2);
            userMapper.deleteByPrimaryKey(2);
            User user3 = userMapper.selectByPrimaryKey(1);
            Assert.assertEquals(user2, user3);
        } finally {
            sqlSession.close();
        }
    }
}
