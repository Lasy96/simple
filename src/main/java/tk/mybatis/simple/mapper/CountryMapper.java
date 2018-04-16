package tk.mybatis.simple.mapper;

import java.util.List;
import tk.mybatis.simple.model.entity.Country;

public interface CountryMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Country record);

    Country selectByPrimaryKey(Integer id);

    List<Country> selectAll();

    int updateByPrimaryKey(Country record);
}