package com.example.aop.aspectexample;

import com.example.aop.aspectexample.service.FirstService;
import com.example.aop.aspectexample.service.SecondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AspectExampleApplication implements CommandLineRunner {

    @Autowired
    FirstService firstService;

    @Autowired
    SecondService secondService;

    public static void main(String[] args) {
        SpringApplication.run(AspectExampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        firstService.doSomething();
        secondService.doSomething();
    }
}
