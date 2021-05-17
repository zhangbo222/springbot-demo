package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Bo ZHANG
 * @Date 21/04/2021
 */

@RestController
@RequestMapping("/api/v1/image")
public class ImageServiceController {
    @RequestMapping(value = {"/doc"}, method = RequestMethod.POST)
    public void getDoc(@RequestParam JSONObject request) {

    }

    @RequestMapping(value = {"/face"}, method = RequestMethod.POST)
    public void getFace(@RequestParam JSONObject request) {

    }
}
