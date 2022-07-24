package com.example.crud.exception;


import com.example.crud.exception.error.ApiError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(GlobalException.class)
    public ResponseEntity<ApiError> handleException(GlobalException globalException)
    {
        ApiError apiError = new ApiError(globalException.getStatus() , globalException.getErrorDetails());

        return new ResponseEntity<>(apiError , HttpStatus.OK);
    }
}
