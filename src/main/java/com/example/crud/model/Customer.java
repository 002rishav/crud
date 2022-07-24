package com.example.crud.model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Customer")
@Entity
@Data
public class Customer {

    @Id
    private long id ;

    @Column
    private String accountType ;

    @Column
    private int balance ;

    @Column(name = "customername")
    private String customerName ;
}
