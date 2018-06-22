package com.yhl.model.mapper;

import com.yhl.model.entity.Article;
import org.apache.ibatis.annotations.Param;

/**
 * @author Lasy
 * @date 2018/6/22 13:57
 */
public interface ArticleMapper {

    /**
     * 创建文章
     *
     * @param article 文章参数
     * @return 标识
     */
    Integer create(@Param("article") Article article);
}