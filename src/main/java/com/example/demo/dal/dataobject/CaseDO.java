package com.example.demo.dal.dataobject;

import lombok.Data;

/**
 * @Author Bo ZHANG
 * @Date 04/05/2021
 */

@Data
public class CaseDO {
    private int    id;
    private String doc_type;
    private String service_level;
    private String doc_image_front;
    private String doc_image_back;
    private String doc_image_angle;
    private String doc_image_flash;
    private String face_image;
    private String case_type;
    private int    status;
    private String description;
}
