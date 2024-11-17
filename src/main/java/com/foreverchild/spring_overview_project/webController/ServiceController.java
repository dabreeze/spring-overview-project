package com.foreverchild.spring_overview_project.webController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    @GetMapping("/home")
    public String getFirstEndpoint (){
        return "This is the first endpoint";
    }

    @GetMapping("/teaminfo")
    public String teaemInfo(){
        return "Coach: "+ coachName+"\n"+ " team name: "+teamName;

    }
}
