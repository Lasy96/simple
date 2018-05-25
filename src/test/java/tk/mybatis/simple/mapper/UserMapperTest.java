package tk.mybatis.simple.mapper;

import org.apache.ibatis.session.SqlSession;
import tk.mybatis.simple.BaseMapperTest;

/**
 * Created by hxh
 * 2018/3/27.
 */
public class UserMapperTest extends BaseMapperTest {
//    SqlSession sqlSession = getSqlSession();

//    @Test
//    public void testSelectAll() {
//        try {
////            List<User> userList = sqlSession.selectList("tk.mybatis.simple.model.mapper.UserMapper.listAll");
////            List<User> userList = sqlSession.selectList("tk.mybatis.simple.model.mapper.UserMapper.listAll");
////            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
////            List<User> userList = userMapper.listAll();
////            Integer i = 2;
////            User user = userMapper.listById(i);
////            Assert.assertNotNull(user);
////            Assert.assertTrue(userList.size() > 0);
//            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//            Integer id = 2;
//            User user = getId(id);
//            Integer id2 = 2;
//            authority.setId(id2);
//            List<User> userList = userMapper.selectAll();
//            Assert.assertTrue(userList.size() > 0);
////            printUserList(userList);
//        } finally {
//            sqlSession.close();
//        }
//    }
//
//    private User getId(Integer id) {
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
////        User user = userMapper.listById(id);
//        return null;
//    }
//
//
//    private void printUserList(List<User> userList) {
//        userList.forEach(user -> {
//            System.out.printf("%-4d\t%4s\t%4s\n",
//                    user.getId(), user.getUserName(), user.getPassword());
//        });
//    }
//
//    @Test
//    public void add() {
//        try {
//            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//            User user = new User();
//            user.setUserName("夕阳蓝");
//            user.setPassword("465412");
//            user.setMail("2245@er.com");
//            user.setIntro("群众简介");
//            user.setCreateTime(new Date());
////            userMapper.add(user);
//        } finally {
////            sqlSession.rollback();
////            sqlSession.commit();
//            sqlSession.close();
//        }
//    }
//
//    @Test
//    public void update() {
//        try {
//            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//            User user = new User();
//            user.setId(1);
//            user.setUserName("夕阳红");
//            user.setPassword("214654");
//            user.setMail("2245@ed.com");
//            user.setIntro("个人简介");
//            user.setUpdateTime(new Date());
////            userMapper.update(user);
//        } finally {
////            sqlSession.rollback();
////            sqlSession.commit();
//            sqlSession.close();
//        }
//    }
//
//    @Test
//    public void delete() {
//        try {
//            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
////            userMapper.delete(11);
//        } finally {
////            sqlSession.rollback();
////            sqlSession.commit();
//            sqlSession.close();
//        }
//    }
//
//    @Test
//    public void selectById() {
//        try {
//            UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
////            mapper.selectById(1);
////            mapper.selectId(2);
////            mapper.listAll();
//        } finally {
//            sqlSession.close();
//        }
//    }
//
//    @Test
//    public void createUser() {
//        try {
//            UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
//            User user = new User();
//            user.setUserName("猎户星座");
//            user.setPassword("87645129");
//            user.setMail("125134@ed.com");
//            user.setIntro("一个人的简介");
//            user.setHeadPortrait("78564123");
////            mapper.createUser(user);
//        } finally {
//            sqlSession.commit();
//            sqlSession.close();
//        }
//    }
}
