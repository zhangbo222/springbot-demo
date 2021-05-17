package com.example.demo.dal.dataobject;

import lombok.Data;

/**
 * @Author Bo ZHANG
 * @Date 04/05/2021
 */

@Data
public class ResultDO {
    private int id;
    private int record_id;
    private String env;
    private String check_result;
    private String expected_result;
    private String final_result;
}
