package org.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler extends RuntimeException{

    @ExceptionHandler(Exception.class)
    public ResponseEntity handlerIllegalException(Exception ex) {
        String message = String.format("%s %s", LocalDateTime.now(), ex.getMessage());
        ResponseException response = new ResponseException(message);
        return new ResponseEntity(response, HttpStatus.BAD_REQUEST);
    }

}
