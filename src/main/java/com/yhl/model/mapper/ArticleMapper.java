package com.yhl.model.mapper;

import com.yhl.model.entity.Article;
import org.apache.ibatis.annotations.Param;

public interface ArticleMapper {

    Integer create(@Param("article") Article article);
}