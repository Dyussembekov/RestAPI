package com.example.Spring.Student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    private Object Month;

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository
    ) {
        return args -> {
            Student john = new Student(
                    1L,
                    "John",
                    "john@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 1),
                    23
            );
        };

            Student alex = new Student(
                    1L,
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2002, Month.JANUARY, 3),
                    21
            );

        repository.saveAll(
            List.of(john, alex)
        );
    }
}

