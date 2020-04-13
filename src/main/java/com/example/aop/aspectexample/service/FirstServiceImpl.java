package com.example.aop.aspectexample.service;

import org.springframework.stereotype.Service;

@Service
public class FirstServiceImpl implements FirstService {
    public void doSomething() {
        //some logic
        try {
            System.out.println("Inside first service");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
