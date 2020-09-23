package com.example.demo.service;

import com.example.demo.model.Customer;

import java.util.List;
import java.util.Optional;


public interface CustomerService {

    Optional<Customer> getById(Long id);

    void save(Customer customer);

    void delete(Long id);

    List<Customer> getAll();
}
