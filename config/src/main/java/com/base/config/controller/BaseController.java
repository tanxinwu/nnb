package com.base.config.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("test")
public class BaseController {


    @PostMapping()
    public String test(){
        return "testjson";
    }


    @GetMapping()
    public String getTest(){
        return "";
    }

    @DeleteMapping("/{id}")
    public int deleteTest(@PathVariable("id") Integer id){
        return 0;
    }
}
