package com.example.crud.exception.error;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiError {

    private int status ;

    private ErrorDetails errorDetails ;


}
