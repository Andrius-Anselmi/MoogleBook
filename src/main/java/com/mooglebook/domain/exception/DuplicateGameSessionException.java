package com.mooglebook.domain.exception;

public class DuplicateGameSessionException extends RuntimeException {
    public DuplicateGameSessionException(String message){
        super(message);
    }
}
