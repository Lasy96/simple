package com.yhl.service;

import com.yhl.rest.param.article.ArticleParam;

/**
 * @author Lasy
 * @date 2018/6/20 16:25
 */
public interface ArticleServiceI {
    /**
     * 创建文章
     *
     * @param param 文章参数
     * @return 标识
     */
    Integer create(ArticleParam param);
}
