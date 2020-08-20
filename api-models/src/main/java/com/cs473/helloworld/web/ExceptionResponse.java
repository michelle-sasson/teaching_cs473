package com.cs473.helloworld.web;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExceptionResponse {

    private String message;
}
