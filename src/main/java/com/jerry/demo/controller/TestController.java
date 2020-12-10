package com.jerry.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jerry
 * @date 2020/12/10
 */
@RestController
public class TestController {

    @GetMapping("/justTest")
    public String justTest(){
        return "Hello, World";
    }

}
