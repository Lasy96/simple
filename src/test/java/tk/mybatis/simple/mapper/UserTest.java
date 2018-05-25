package tk.mybatis.simple.mapper;

import com.yhl.model.dao.UserDao;
import com.yhl.service.impl.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.simple.BaseMapperTest;

import javax.annotation.Resource;

/**
 * @author Lasy
 * @date 2018/5/24 16:36
 */
public class UserTest extends BaseMapperTest {
    @Autowired
    private UserService service;

    @Resource
    private UserDao dao;

    @Test
    public void test() {
        dao.getId(1);
    }
}
