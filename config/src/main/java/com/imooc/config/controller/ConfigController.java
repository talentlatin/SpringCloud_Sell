package com.imooc.config.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Latin
 * 2020/8/8 15:46
 */
@RestController
public class ConfigController {
    @GetMapping("config")
    public String Config(){
        return "success";
    }
}
