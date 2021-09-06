package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PhoneNumber;

@RestController
public class CustomerController {

	@Autowired
	CustomerService custService;
	
	@GetMapping("/customer/phonenumbers")
	public List<PhoneNumber> getAllPhoneNumbers() {
		return custService.getAllPhoneNumbers();
	}
	
}
