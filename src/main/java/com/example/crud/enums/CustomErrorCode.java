package com.example.crud.enums;

import lombok.Getter;
import lombok.Setter;

public enum CustomErrorCode {

    EXP_1(500 , "Id not in database") ,
    EXP_2(500, "Unable to connect to database");


    @Getter
    private int status ;


    @Getter
    private String message  ;

    CustomErrorCode(int status , String message)
    {
        this.status = status ;
        this.message = message ;
    }
}
