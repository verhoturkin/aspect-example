package com.example.aop.aspectexample.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DbService implements DataService {
    private static final Logger LOG = LoggerFactory.getLogger("DbService");

    @Override
    @Transactional
    public void persist() {
        //do some logic
        LOG.info("saving ...");
    }
}
