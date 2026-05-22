package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // 외부 프론트엔드 서비스 접근 허용
public class DataController {

    @GetMapping("/data")
    public Map<String, Object> getBackendData() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Hello from Spring Boot Backend (abcd_be)!");
        response.put("version", "JDK 17 on Kubernetes (com.example.demo)");
        return response;
    }
}