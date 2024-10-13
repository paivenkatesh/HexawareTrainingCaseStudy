package com.hexaware.cc.service;

import com.hexaware.cc.entity.Customer;

public interface ICustomer {
    
    Customer getCustomerById(int customerId);
    
    Customer getCustomerByUsername(String username);
    
    int registerCustomer(Customer customerData);
    
    int updateCustomer(Customer customerData);
    
    int deleteCustomer(int customerId);
}