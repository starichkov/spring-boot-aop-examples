package org.starichkov.java.spring.aop.aspect;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author Vadim Starichkov
 * @since 07.12.2018 13:31
 */
@Aspect
@Component
@Slf4j
public class ExecutionTimeAspect {

    @Around("@annotation(LogExecutionTime)")
    public Object aroundHandler(ProceedingJoinPoint joinPoint) throws Throwable {
        LocalDateTime executionStarted = LocalDateTime.now();

        Object result = joinPoint.proceed();

        LocalDateTime executionFinished = LocalDateTime.now();

        log.info("Method executed in {} ms",
                ChronoUnit.MILLIS.between(executionStarted, executionFinished));

        return result;
    }
}
