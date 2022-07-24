package com.example.crud.controller;


import com.example.crud.enums.CustomErrorCode;
import com.example.crud.exception.GlobalException;
import com.example.crud.model.Customer;
import com.example.crud.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService ;

    @PostMapping("/getDetailsById")
    public Customer getDetails(@PathParam("id") long id) throws GlobalException {
        return customerService.getDetailsById(id);
    }

    @PostMapping("/exceptionTest")
    public void getException()
    {
        throw new GlobalException(CustomErrorCode.EXP_1);
    }
}
