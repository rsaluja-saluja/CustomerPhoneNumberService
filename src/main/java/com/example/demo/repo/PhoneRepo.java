package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Customer;
import com.example.demo.model.PhoneNumber;

public interface PhoneRepo extends CrudRepository<PhoneNumber, String> {

}
