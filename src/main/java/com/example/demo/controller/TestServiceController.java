package com.example.demo.controller;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import com.example.demo.dal.daointerface.TagDAO;
import com.example.demo.dal.dataobject.TagDO;
import com.fasterxml.jackson.annotation.JsonAlias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Bo ZHANG
 * @Date 25/09/2020
 */

@RestController
@RequestMapping("/api/v1/case")
public class TestServiceController {
    @Autowired
    TagDAO tagDAO;

    @RequestMapping(value = {"/run"}, method = RequestMethod.POST)
    public void executeCases(@RequestBody JSONObject request) {

    }

    @RequestMapping(value ={"/add"}, method = RequestMethod.POST)
    public void addEmployee(@RequestBody JSONObject request) {

    }

    @RequestMapping(value = {"/list"}, method = RequestMethod.POST)
    public List<TagDO> getAll(@RequestBody JSONObject request) {
        List<TagDO> tagDO = tagDAO.getAll();
        return tagDO;
    }
}
