package com.gilbert.invoice.services;

import com.gilbert.invoice.models.Customer;
import com.gilbert.invoice.repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    public Customer addCustomer(Customer customer){
        System.out.println(customer.toString());
        return customerRepo.save(customer);
    }
}
