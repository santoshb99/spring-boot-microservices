package com.testlab.departmentservice.exception;

import com.testlab.departmentservice.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse> handlerResourceNotFoundException(ResourceNotFoundException exception){
        String message = exception.getMessage();
        ErrorResponse response = ErrorResponse.builder().status(HttpStatus.NOT_FOUND).errorMessage(message).timeStamp(LocalDateTime.now()).build();

        return new ResponseEntity<ErrorResponse>(response, HttpStatus.NOT_FOUND);
    }

}
