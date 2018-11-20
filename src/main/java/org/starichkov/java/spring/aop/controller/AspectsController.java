package org.starichkov.java.spring.aop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.starichkov.java.spring.aop.dto.SampleDto;

/**
 * @author Vadim Starichkov
 * @since 20.11.2018 18:49
 */
@RestController
@RequestMapping("/")
@Slf4j
public class AspectsController {

    @GetMapping
    public SampleDto getSampleDto() {
        return new SampleDto(1L, "Just sample object");
    }

    @PostMapping
    public void printSampleDto(@RequestBody SampleDto sampleDto) {
        log.info("Received SampleDto: {}", sampleDto);
    }
}
