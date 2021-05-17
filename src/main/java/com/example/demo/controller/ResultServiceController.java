package com.example.demo.controller;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

import com.example.demo.dal.daointerface.ResultDAO;
import com.example.demo.dal.dataobject.CaseDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Bo ZHANG
 * @Date 04/05/2021
 */

@RestController
@RequestMapping("/api/v1/result")
public class ResultServiceController {
    @Autowired
    ResultDAO resultDAO;

    @RequestMapping(value = {"/list"}, method = RequestMethod.POST)
    public List<CaseDO> getAll(@RequestBody JSONObject request) {
        return resultDAO.getAll();
    }

    @RequestMapping(value = {"/detail"}, method = RequestMethod.POST)
    public CaseDO getDetail(@RequestBody JSONObject request) {
        return resultDAO.getDetail(request.getInteger("id_record"));
    }
}
