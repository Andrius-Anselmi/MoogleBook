package com.mooglebook.infrastructure.exception;

import com.mooglebook.domain.exception.DuplicateGameException;
import com.mooglebook.domain.exception.DuplicateGameSessionException;
import com.mooglebook.domain.exception.NotFoundGameException;
import com.mooglebook.domain.exception.NotFoundGameSessionException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundGameException.class)
    public ResponseEntity<String> handleNotFoundGame(NotFoundGameException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DuplicateGameException.class)
    public ResponseEntity<String> handleDuplicateGame(DuplicateGameException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(DuplicateGameSessionException.class)
    public ResponseEntity<String> handleDuplicateGameSession(DuplicateGameSessionException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(NotFoundGameSessionException.class)
    public ResponseEntity<String> handleNotFoundGameSession(NotFoundGameSessionException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
