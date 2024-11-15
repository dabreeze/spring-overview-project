package com.foreverchild.spring_overview_project.webController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @GetMapping("/first-endpoint")
    public String getFirstEndpoint (){
        return "This is the first endpoint";
    }
}
