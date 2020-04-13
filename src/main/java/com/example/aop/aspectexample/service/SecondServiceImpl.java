package com.example.aop.aspectexample.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SecondServiceImpl implements SecondService {
    private static final Logger LOG = LoggerFactory.getLogger("SecondServiceImpl");

    public void doSomething() {
        //some logic
        try {
            long start = System.currentTimeMillis();
            LOG.info("Inside second service");
            Thread.sleep(200);
            LOG.info("Second service execution time: " + (System.currentTimeMillis() - start));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
