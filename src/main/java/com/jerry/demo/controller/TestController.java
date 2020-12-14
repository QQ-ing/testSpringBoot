package com.jerry.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Jerry
 * @date 2020/12/10
 */
@RestController
public class TestController {
    
    @GetMapping("/")
    public String livenessProbe(){
        return "UP";
    }
    
    @GetMapping("/justTest")
    public String justTest() throws UnknownHostException {
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println("host:" + addr.getHostName());
        System.out.println("ip:" + addr.getHostAddress());
        return "Hello, World！"+" host:" + addr.getHostName()+" ip:" + addr.getHostAddress();
    }

}
