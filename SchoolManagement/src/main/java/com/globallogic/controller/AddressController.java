package com.globallogic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.globallogic.Repo.AddressRepo;
import com.globallogic.entity.Address;


@RestController
@RequestMapping("/address")
public class AddressController {
	@Autowired
	AddressRepo repo;
	
	@GetMapping("/")
	public List<Address> showAddress(){
		return repo.findAll();
	}
	
	@PostMapping("/")
	public Address saveAddress(@RequestBody Address address) {
		repo.save(address);
		return address;
	}
	
	@PutMapping("/")
	public Address updateAddress(@RequestBody Address address) {
		repo.save(address);
		return address;
	}
	
	@DeleteMapping("/{id}")
	public String deleteAddress(@PathVariable("id") long id) {
		repo.deleteById(id);
		return "Record has been deleted!";
	}

}
