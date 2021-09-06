package com.example.demo;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Customer;
import com.example.demo.model.PhoneNumber;
import com.example.demo.repo.CustomerRepo;
import com.example.demo.repo.PhoneRepo;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class CustomerPhoneNumberApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerPhoneNumberApplication.class, args);
	}

	@Bean
	public CommandLineRunner customerDemo(CustomerRepo custRepo, PhoneRepo phoneRepo) {
		return (args) -> {
//			byte[] jsonData = Files.readAllBytes(Paths.get("customerPhoneNumbers.json"));
//
//			ObjectMapper objectMapper = new ObjectMapper();
//			List<Customer> list = objectMapper.readValue(jsonData, new TypeReference<ArrayList<Customer>>() {
//			});
		
//			System.out.println("Creating customer");
//			Customer c1 = new Customer();
//			custRepo.save(c1);
//			
//			
//			System.out.println("Adding Phone Number");
//			PhoneNumber p1 = new PhoneNumber("Home","1234",true);
//			PhoneNumber p2 = new PhoneNumber("Work","1234",false);
//			
//			p1.setCustomer(c1);
//			p2.setCustomer(c1);
//			
//			phoneRepo.save(p1);
//			
//			System.out.println(custRepo.findById(1).get().toString());
//			System.out.println(custRepo.findById(1).get().getPhoneNumbers());
//			custRepo.saveAll(list);
//			
//			System.out.println("ElementCollection drawback");
//			Customer cust = custRepo.findById(1).get();
//			cust.getPhoneNumbers().add(new PhoneNumber("Test","5634",false));
//			custRepo.save(cust);
			
			
			byte[] jsonData = Files.readAllBytes(Paths.get("customerPhoneNumbers.json"));

			ObjectMapper objectMapper = new ObjectMapper();
			List<PhoneNumber> list = objectMapper.readValue(jsonData, new TypeReference<ArrayList<PhoneNumber>>() {
			});
		
			System.out.println("Creating customer");
			Customer c1 = new Customer();
			Customer c2 = new Customer();
			custRepo.save(c1);
			custRepo.save(c2);
			
			phoneRepo.saveAll(list);
			System.out.println("Customer details:");
			System.out.println("Customer 1: "+custRepo.findById(1).get());//.getPhoneNumbers());
			System.out.println("Customer 2: "+custRepo.findById(2).get());//.getPhoneNumbers());
			System.out.println("Phone Numbers: "+phoneRepo.findAll());
		};
	}
}
