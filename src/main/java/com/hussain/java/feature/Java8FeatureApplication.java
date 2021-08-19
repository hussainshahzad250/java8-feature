package com.hussain.java.feature;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@SpringBootApplication
public class Java8FeatureApplication {
    public static void main(String[] args) {
        SpringApplication.run(Java8FeatureApplication.class, args);
    }
    @GetMapping(value = "/test")
    public String hello() {
        log.info("DOne");
        return "Masoom Raza";
    }
}
