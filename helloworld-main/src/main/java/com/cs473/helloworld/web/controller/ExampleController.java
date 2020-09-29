package com.cs473.helloworld.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cs473.helloworld.exception.NotFoundException;
import com.cs473.helloworld.web.ExampleResponse;

@RestController
public class ExampleController {

    @GetMapping("/ping")
    public String ping() {
        return "hello world";
    }

    @GetMapping("/name")
    public String name() {
        return "Hello World! This is Patrick Johnson, 23437520 via Docker";
    }

    @GetMapping("/example")
    public ExampleResponse example(
            @RequestParam(name="name") String name,
            @RequestParam(name="value") String value) {

        return ExampleResponse
                .builder()
                .name(name)
                .value(value)
                .build();
    }

    @GetMapping("/exception")
    public void exception(
            @RequestParam(name="status", required=false) int status) {
        if (404 == status) {
            throw new NotFoundException("testing");
        }
        throw new RuntimeException();
    }
}
