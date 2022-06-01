package com.example.amigoscode.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class AmigoscodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmigoscodeApplication.class, args);
    }


}
