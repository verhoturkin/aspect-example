package com.example.aop.aspectexample.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class FirstServiceImpl implements FirstService {
    private static final Logger LOG = LoggerFactory.getLogger("FirstServiceImpl");

    public void doSomething() {
        //some logic
        try {
            LOG.info("Inside first service");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
