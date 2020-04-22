package com.ebw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/{id}")
    public String hello(@PathVariable("id") String id) {
        logger.info("hello index param:{}", id);
        return "hello";
    }
}
