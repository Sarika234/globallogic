package com.globallogic.MyProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.globallogic.MyProject.entity.MerchantEntity;
import com.globallogic.MyProject.repo.MerchantRepo;

@RestController
@RequestMapping("/merchant")
public class MerchantController {
	
	@Autowired
	MerchantRepo repo;
	
	//use GET request to retrieve all the data
	@GetMapping("/")
	public List<MerchantEntity> showMerchant(){
		return repo.findAll();  //return all the rows from the table
	}
	
	//POST request
	@PostMapping("/")
	public List<MerchantEntity> saveMerchant(@RequestBody MerchantEntity merchant) {
		repo.save(merchant);
		return repo.findAll();  // send the data with the body in JSON format
	}
	
	//Update request
	@PutMapping("/")
	public MerchantEntity updateMerchant(@RequestBody MerchantEntity merchant) {
		repo.save(merchant);
		return merchant;  
	}
	
	// Delete Request
	@DeleteMapping("/{id}")
	public String deleteMerchant(@PathVariable("id") int id) {
		System.err.println("deleted id is : " + id);
		repo.deleteById(id);
		return "Record Has been deleted !";
	}

}
