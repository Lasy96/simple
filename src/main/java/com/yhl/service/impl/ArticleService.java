package com.yhl.service.impl;

import com.alibaba.dubbo.rpc.exception.DubboException;
import com.yhl.model.dao.ArticleDao;
import com.yhl.model.dao.UserDao;
import com.yhl.model.entity.Article;
import com.yhl.model.entity.User;
import com.yhl.model.enums.DeleteStatus;
import com.yhl.rest.param.article.ArticleParam;
import com.yhl.service.ArticleServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;

/**
 * @author Lasy
 * @date 2018/6/20 16:36
 */
@Service("articleService")
public class ArticleService implements ArticleServiceI {
    @Autowired
    private ArticleDao dao;
    @Autowired
    private UserDao userDao;

    @Override
    public Integer create(ArticleParam param) {
        if (param.getUserId() == null || param.getUserId() < 1) {
            throw new DubboException("用户id不能为空!");
        }
        User user = dao.getId(param.getUserId());
        if (user == null || user.getId() == null) {
            throw new DubboException("用户不存在!");
        }
        Assert.notNull(param.getTitle(), "标题不能为空!");
        Assert.notNull(param.getContent(), "内容不能为空!");
        Assert.notNull(param.getAuthor(), "作者不能为空!");
        Article article = new Article();
        article.setTitle(param.getTitle());
        article.setContent(param.getContent());
        article.setAuthor(param.getAuthor());
        article.setCreateTime(new Date());
        article.setDeleted(DeleteStatus.未删除.getCode());
        article.setUserId(param.getUserId());
        return dao.create(article);
    }
}
