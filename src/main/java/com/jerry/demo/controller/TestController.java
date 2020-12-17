package com.jerry.demo.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Jerry
 * @date 2020/12/10
 */
@RestController
public class TestController {
    
    @GetMapping("/")
    public String index(){
        return "UP";
    }
    
    @GetMapping("/liveness")
    public String livenessProbe(){
        return "Success";
    }
    
    @GetMapping("/justTest")
    public String justTest() throws UnknownHostException {
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println("host:" + addr.getHostName());
        System.out.println("ip:" + addr.getHostAddress());
        return "Hello, World！123456"+" host:" + addr.getHostName()+" ip:" + addr.getHostAddress();
    }
    
    @GetMapping("/ethBlockNumber")
    public String ethBlockNumber() {
        
        String url="http://besu-node.members.svc.cluster.local:8545";
        // create an instance of RestTemplate
        RestTemplate restTemplate = new RestTemplate();

        // create headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
    
        Map<String, Object> map = new HashMap<>();
        map.put("jsonrpc", "2.0");
        map.put("method", "eth_blockNumber");
        map.put("params", null);
        map.put("id",1);
        
        // build the request
        HttpEntity<Map<String, Object>> entity = new HttpEntity<>(map, headers);

        // send POST request
        ResponseEntity<String> response = restTemplate.postForEntity(url, entity, String.class);
    
        return response.getBody();
    }

}
