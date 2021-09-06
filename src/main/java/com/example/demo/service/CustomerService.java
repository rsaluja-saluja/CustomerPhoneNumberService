package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PhoneNumber;
import com.example.demo.repo.CustomerRepo;
import com.example.demo.repo.PhoneRepo;

@Service
public class CustomerService {

	@Autowired
	CustomerRepo custRepo;
	
	@Autowired
	PhoneRepo phoneRepo;
	
	public List<PhoneNumber> getAllPhoneNumbers() {
		List<PhoneNumber> list = new ArrayList<>();
		phoneRepo.findAll().forEach(list::add);
		return list;
	}
}
