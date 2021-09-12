package com.base.config.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {


    @PostMapping("test324234")
    public String test(){
        return "testjson";
    }
}
