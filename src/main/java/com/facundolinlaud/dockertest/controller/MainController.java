package com.facundolinlaud.dockertest.controller;

import com.facundolinlaud.dockertest.model.Something;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MainController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/")
    public Something main(@RequestParam(value="name", defaultValue="World") String name) {
        return new Something(counter.incrementAndGet(), String.format(template, name));
    }
}
