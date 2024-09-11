package com.testlab.employeeservice.exception;

import com.testlab.employeeservice.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse> handlerResourceNotFound(ResourceNotFoundException exception){
        ErrorResponse response = ErrorResponse.builder().status(HttpStatus.NOT_FOUND).errorMessage(exception.getMessage()).timestamp(LocalDateTime.now()).build();

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
