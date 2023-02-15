package com.amaxnetlab.elk.resources;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@Slf4j
public class HomeResource {

    @GetMapping("/")
    public String home() {
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("Home page ELK" + localDateTime);
        return "Welcome to ELK";
    }

    @GetMapping("/logs")
    public String LogsPage(){
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("This Logs page " + localDateTime);
        return "Welcome to logs page";
    }

    @GetMapping("/warn")
    public String WarnPage(){
        LocalDateTime localDateTime = LocalDateTime.now();
        log.warn("This warn page " + localDateTime);
        return "Welcome to warn page";
    }


    @GetMapping("/er")
    public String ErrorPage(){
        LocalDateTime localDateTime = LocalDateTime.now();
        log.error("This error page " + localDateTime);
        return "Welcome to error page";
    }
}
