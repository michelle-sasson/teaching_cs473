package com.cs473.helloworld.web.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cs473.helloworld.exception.NotFoundException;
import com.cs473.helloworld.web.ExampleResponse;

public class ExampleControllerTest {

    private ExampleController exampleController;
    
    @BeforeEach
    public void setup() {
        this.exampleController = new ExampleController();
    }

    @Test
    public void testPing() {
        assertEquals("hello world", exampleController.ping());
    }
    
    @Test
    public void testExample() {
        String name = "name";
        String value = "value";
        ExampleResponse expectedResponse = ExampleResponse.builder()
            .name(name)
            .value(value)
            .build();
        assertEquals(expectedResponse, exampleController.example(name, value));
    }

    @Test
    public void testException_404() {
        assertThrows(NotFoundException.class, () -> exampleController.exception(404));
    }

    @Test
    public void testException_500() {
        assertThrows(RuntimeException.class, () -> exampleController.exception(500));
    }

}
