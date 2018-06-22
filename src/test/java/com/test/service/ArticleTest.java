package com.test.service;

import com.test.BasicTest;
import com.yhl.rest.param.article.ArticleParam;
import com.yhl.service.impl.ArticleService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Lasy
 * @date 2018/6/22 11:18
 */
public class ArticleTest extends BasicTest {
    @Autowired
    private ArticleService service;

    @Test
    public void test() {
        ArticleParam param = new ArticleParam();
        param.setTitle("阿根廷0:3惨败克罗地亚");
        param.setContent("梅西令人失望");
        param.setUserId(15);
        param.setAuthor("匿名");
        service.create(param);
    }
}
