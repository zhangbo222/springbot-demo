package com.example.demo.dal.daointerface;

import com.example.demo.dal.dataobject.CaseDO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CaseDAO {
    /**
     *
     */
    @Insert("INSERT INTO z_record values(#{id}, #{doc_type}, #{service_level}, #{doc_image_front}, #{doc_image_back}, #{doc_image_angle},"
            + " #{doc_image_flash}, #{face_image}, #{case_type}, #{status}, #{description})")
    void addRecord(CaseDO caseDO);

    /**
     *
     */
    @Update("UPDATE z_record set where #{id}")
    void updateRecord();
}
