package com.dailycodebuffer.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBackMethod")
    public String userServiceFallBackMethod(){
        return "User Service is taking longar than expected" +
                ", Please try again later";
    }
    @GetMapping("/departmentServiceFallBackMethod")
    public String departmentServiceFallBackMethod(){
        return "Department Service is taking longar than expected" +
                ", Please try again later";
    }
}
