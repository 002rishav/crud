package com.example.crud.service.impl;


import com.example.crud.enums.CustomErrorCode;
import com.example.crud.exception.GlobalException;
import com.example.crud.model.Customer;
import com.example.crud.repository.CustomerRepository;
import com.example.crud.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {
    /**
     * @param id
     * @return
     */
    @Autowired
    private CustomerRepository customerRepository ;

    @Override
    public Customer getDetailsById(long id) throws GlobalException {
        Optional<Customer> customerOptional =  customerRepository.findById(id) ;
        return customerOptional.orElseThrow(new GlobalException(CustomErrorCode.EXP_2));

    }
}
