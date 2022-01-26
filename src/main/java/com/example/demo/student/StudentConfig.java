package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.FEBRUARY;
import static java.time.Month.SEPTEMBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student evert = new Student(
                    "Evert",
                    "evert.albert@hotmail.be",
                    LocalDate.of(1996, FEBRUARY, 17)
            );

            Student elsa = new Student(
                    "Elsa",
                    "elsa@hotmail.be",
                    LocalDate.of(2000, SEPTEMBER, 13)
            );

            repository.saveAll(
                    List.of(evert, elsa)
            );
        };
    }
}
