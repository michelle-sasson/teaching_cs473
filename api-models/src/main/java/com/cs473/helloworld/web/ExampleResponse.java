package com.cs473.helloworld.web;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExampleResponse {

    private String name;
    private String value;
}
