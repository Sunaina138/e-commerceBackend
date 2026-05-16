package com.commerce.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CartAlreadyHasException.class)
    public String AlreadyAddedToCart(CartAlreadyHasException ex){
        return ex.getMessage();
    }




}
