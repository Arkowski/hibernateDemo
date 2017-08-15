package com.ak.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("com.ak.entity")
@EnableAutoConfiguration
@EnableJpaRepositories ("com.ak.dao")
@ComponentScan({"com.ak.service", "com.ak.controller"})
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args); //informacje o klasie w ktorej jest uruchamianie

    }
}
