package net.vivek.journalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("/health-check")
    public String healCheck(){
        return "ok";
    }
}
