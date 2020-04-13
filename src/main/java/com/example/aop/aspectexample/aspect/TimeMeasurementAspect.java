package com.example.aop.aspectexample.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeMeasurementAspect {
    private static final Logger LOG = LoggerFactory.getLogger("TimeMeasurementAspect");

    @Around("firstService() || secondService()")
    public void measure(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        joinPoint.proceed();
        LOG.info(joinPoint.toShortString() + " took " + (System.currentTimeMillis() - start) + "ms");
    }

    @Pointcut("execution(* com.example.aop.aspectexample.service.FirstService.doSomething())")
    public void firstService() {
    }

    @Pointcut("execution(* com.example.aop.aspectexample.service.SecondService.doSomething())")
    public void secondService() {
    }
}
