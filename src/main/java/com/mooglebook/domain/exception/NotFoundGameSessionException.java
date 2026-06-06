package com.mooglebook.domain.exception;

public class NotFoundGameSessionException extends RuntimeException {
    public NotFoundGameSessionException(String message){
        super(message);
    }
}
