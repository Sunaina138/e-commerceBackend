package com.commerce.exception;


public class CartAlreadyHasException extends RuntimeException {


    public  CartAlreadyHasException(String msg){
        super(msg);
    }
}
