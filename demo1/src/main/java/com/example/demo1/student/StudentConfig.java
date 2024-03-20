package com.example.demo1.student;
import java.time.LocalDate;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Month;

import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
     Student mario = new Student(

             "mario",
             "mario.jomala@gmail.com",

             LocalDate.of(2000, Month.JANUARY, 5)
     );
               Student elisa= new Student(

                       "elisa",
                       "elisa.jomala@gmail.com",

                       LocalDate.of(2000, Month.JANUARY, 5)
            );
            Student Debola= new Student(

                    "Debolla",
                    "Debolla.jomala@gmail.com",

                    LocalDate.of(2000, Month.JANUARY, 5)
            );
            Student Kevin = new Student(

                    "Kevin",
                    "kevin.jomala@gmail.com",

                    LocalDate.of(2000, Month.JANUARY, 5)
            );
            repository.saveAll(
                    List.of(mario,elisa)
            );
        };
    }
}
