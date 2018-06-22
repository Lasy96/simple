package com.yhl.model.dao;

import com.yhl.model.entity.Article;
import com.yhl.model.entity.User;
import com.yhl.model.mapper.ArticleMapper;
import com.yhl.model.mapper.UserMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Lasy
 * @date 2018/6/21 9:15
 */
@Component
public class ArticleDao {
    @Resource
    private ArticleMapper mapper;
    @Resource
    private UserMapper userMapper;

    public User getId(Integer userId) {
        return userMapper.getId(userId);
    }

    public Integer create(Article article) {
        return mapper.create(article);
    }
}
