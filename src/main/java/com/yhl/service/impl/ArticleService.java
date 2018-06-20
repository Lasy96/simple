package com.yhl.service.impl;

import com.alibaba.dubbo.rpc.exception.DubboException;
import com.yhl.rest.param.article.ArticleParam;
import com.yhl.service.ArticleServiceI;
import org.springframework.stereotype.Service;

/**
 * @author Lasy
 * @date 2018/6/20 16:36
 */
@Service("articleService")
public class ArticleService implements ArticleServiceI {
    @Override
    public Integer create(ArticleParam param) {
        if (param.getUserId() == null || param.getUserId() < 1) {
            throw new DubboException("用户不存在!");
        }
        return null;
    }
}
