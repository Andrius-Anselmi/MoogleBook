package com.mooglebook.domain.exception;

public class DuplicateGameException extends RuntimeException {
    public DuplicateGameException(String message){
        super(message);
    }
}
