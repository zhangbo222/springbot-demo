package com.example.demo.dal.daointerface;

import java.util.List;

import com.example.demo.dal.dataobject.CaseDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ResultDAO {
    /**
     * @return
     */
    @Select("SELECT * FROM z_result")
    List<CaseDO> getAll();

    @Select("SELECT * FROM z_result where id={#id}")
    CaseDO getDetail(@Param("id") int id);
}
