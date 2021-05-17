package com.example.demo.dal.daointerface;

import java.util.List;

import com.example.demo.dal.dataobject.TagDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author Bo ZHANG
 * @Date 16/05/2021
 */

@Mapper
public interface TagDAO {

    @Select("SELECT * FROM z_tag")
    List<TagDO> getAll();
}
