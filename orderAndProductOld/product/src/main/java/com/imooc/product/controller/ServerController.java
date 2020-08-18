package com.imooc.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Latin
 * 2020/8/7 10:35
 */
@RestController
public class ServerController {
    @GetMapping("/msg")
    public String msg(){
        return "this is product msg 93 捷豹 2";
    }
}
