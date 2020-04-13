package com.example.aop.aspectexample.service;

import org.springframework.stereotype.Service;

@Service
public class SecondServiceImpl implements SecondService {
    public void doSomething() {
        //some logic
        try {
            System.out.println("Inside second service");
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
