package com.example.aop.aspectexample.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DbServiceTest {

    @Autowired
    DataService dbService;

    @Test
    void persist() {
        dbService.persist();
    }
}