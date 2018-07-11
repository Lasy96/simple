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
        param.setTitle("某主角悲惨人生表示不再做人");
        param.setContent("jojo,我不做人啦!");
        param.setUserId(15);
        param.setAuthor("匿名");
        Integer i = service.create(param);
        System.out.println(i);
    }
}
