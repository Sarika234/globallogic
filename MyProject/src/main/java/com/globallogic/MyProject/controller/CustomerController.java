package com.globallogic.MyProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.globallogic.MyProject.entity.CustomerEntity;
import com.globallogic.MyProject.repo.CustomerRepo;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerRepo repo;
	
	// use GET request to retrieve all the data
	@GetMapping("/")
	public List<CustomerEntity> showCustomer() {
		return repo.findAll(); // return all the rows from the table
	}

	// POST request
	@PostMapping("/")
	public CustomerEntity saveCategory(@RequestBody CustomerEntity customer) {
		repo.save(customer);
		return customer; // send the data with the body in JSON format
	}

	// Update request
	@PutMapping("/")
	public CustomerEntity updateProduct(@RequestBody CustomerEntity customer) {
		System.err.println(customer);
		repo.save(customer);
		System.err.println(customer);
		return customer;
	}

	// Delete Request
	@DeleteMapping("/{id}")
	public String deleteCustomer(@PathVariable("id") int id) {
		System.err.println("deleted id is : " + id);
		repo.deleteById(id);
		return "Record Has been deleted !";
	}

}
