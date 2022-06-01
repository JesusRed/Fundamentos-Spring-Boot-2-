package com.example.amigoscode.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student red = new Student(
                    "Red",
                    LocalDate.of(1999, Month.JULY, 19),
                    "red@mail.com"
            );
            Student blue = new Student(
                    "Blue",
                    LocalDate.of(2000, Month.JUNE, 1),
                    "blue@mail.com"
            );
            repository.saveAll(List.of(red, blue));
        };
    }
}
