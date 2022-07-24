package com.example.crud.exception;


import com.example.crud.enums.CustomErrorCode;
import com.example.crud.exception.error.ErrorDetails;
import lombok.Data;

import java.util.NoSuchElementException;
import java.util.function.Supplier;


@Data
public class GlobalException extends NoSuchElementException implements Supplier<GlobalException> {

    private int status ;

    private ErrorDetails errorDetails ;

    private GlobalException globalException ;

    public GlobalException(CustomErrorCode customErrorCode)
    {
        errorDetails = new ErrorDetails() ;

        this.status = customErrorCode.getStatus() ;
        this.errorDetails.setMessage(customErrorCode.getMessage());
        this.errorDetails.setEnumCode(customErrorCode.name().replace("_" , "-"));
    }


    /**
     * @return
     */
    @Override
    public GlobalException get() {
        return new GlobalException(CustomErrorCode.EXP_1);
    }
}
