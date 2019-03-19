package com.sinosoft.lcn.dao;


import com.sinosoft.lcn.entity.Test;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by maruizhong on 2019/3/18.
 */
@Mapper
public interface TestMapper {


    @Select("SELECT * FROM T_TEST")
    List<Test> findAll();

    @Insert("INSERT INTO T_TEST(NAME) VALUES(#{name})")
    int save(@Param("name") String name);

}
