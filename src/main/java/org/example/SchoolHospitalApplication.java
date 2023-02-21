package org.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.example"})
@MapperScan("org.example.dao")
public class SchoolHospitalApplication {
    public static void main(String[] args) {
        SpringApplication.run(SchoolHospitalApplication.class, args);
    }
}