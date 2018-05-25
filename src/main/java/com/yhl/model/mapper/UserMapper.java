package com.yhl.model.mapper;

import com.yhl.model.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    User getId(@Param("id") Integer id);
}