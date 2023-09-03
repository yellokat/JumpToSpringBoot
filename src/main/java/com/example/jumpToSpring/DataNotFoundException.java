package com.example.jumpToSpring;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="entity not found")
public class DataNotFoundException extends RuntimeException{
    public static final long serialVersionUID = 1L;
    public DataNotFoundException(String message){
        super(message);
    }
}
