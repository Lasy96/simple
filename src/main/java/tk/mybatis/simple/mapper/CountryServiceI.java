package tk.mybatis.simple.mapper;

import tk.mybatis.simple.model.entity.Country;

import java.util.List;

public interface CountryServiceI {

    int deleteByPrimaryKey(Integer id);

    int insert(Country record);

    Country selectByPrimaryKey(Integer id);

    List<Country> selectAll();

    int updateByPrimaryKey(Country record);
}