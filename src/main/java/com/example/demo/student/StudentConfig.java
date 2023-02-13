package com.example.demo.student;

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
          Student mark =  new Student(1L,"Mark", "mark.k@gmail.com", LocalDate.of(2007, Month.JUNE,12));
            repository.save(mark);
        };
    }
}
