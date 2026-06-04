package com.mooglebook.domain.exception;

public class NotFoundGameException extends RuntimeException {
    public NotFoundGameException(String message){
        super(message);
    }
}
