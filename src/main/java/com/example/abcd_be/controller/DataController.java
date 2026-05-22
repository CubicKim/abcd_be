package com.example.abcd_be.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
// ⚠️ 테스트 편의를 위해 모든 도메인에서의 CORS 접근을 임시 허용합니다.
@CrossOrigin(origins = "*")
public class DataController {

    @GetMapping("/data")
    public Map<String, Object> getBackendData() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Hello from Spring Boot Backend (abcd_be)!");
        response.put("version", "JDK 17 on Kubernetes");
        return response;
    }
}