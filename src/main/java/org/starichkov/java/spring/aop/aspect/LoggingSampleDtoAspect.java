package org.starichkov.java.spring.aop.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import org.springframework.stereotype.Component;
import org.starichkov.java.spring.aop.dto.SampleDto;

/**
 * @author Vadim Starichkov
 * @since 20.11.2018 19:19
 */
@Aspect
@Component
@Slf4j
public class LoggingSampleDtoAspect {
    @Pointcut("execution(* org.starichkov.java.spring.aop.controller.AspectsController.*(org.starichkov.java.spring.aop.dto.SampleDto)) && args(sampleDto))")
    public void sampleDtoInParameter(SampleDto sampleDto) {
    }

    @Before(value = "sampleDtoInParameter(sampleDto)", argNames = "sampleDto")
    public void beforeHandler(SampleDto sampleDto) {
        log.info("BEFORE: {}", sampleDto);
    }

    @After(value = "sampleDtoInParameter(sampleDto)", argNames = "sampleDto")
    public void afterHandler(SampleDto sampleDto) {
        log.info("AFTER: {}", sampleDto);
    }
}
