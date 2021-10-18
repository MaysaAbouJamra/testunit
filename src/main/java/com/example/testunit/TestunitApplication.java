package com.example.testunit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestunitApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestunitApplication.class, args);
        Calculatrice calculatrice=new Calculatrice();
        calculatrice.additionner(10,5);
    }

}
