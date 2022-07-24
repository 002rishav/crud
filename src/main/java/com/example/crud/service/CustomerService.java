package com.example.crud.service;

import com.example.crud.exception.GlobalException;
import com.example.crud.model.Customer;

public interface CustomerService {

    public Customer getDetailsById(long id) throws GlobalException;
}
