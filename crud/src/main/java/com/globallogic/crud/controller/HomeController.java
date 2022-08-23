package com.globallogic.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.globallogic.crud.repo.EmployeeRepo;
import com.globallogic.crud.entity.EmployeeEntity;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	EmployeeRepo repo;
	
	//use get to retrieve all the data 
	@GetMapping("/")
	public List<EmployeeEntity> showEmployee(){
		
		//return all the rows from the table
		return repo.findAll();
	}
	
	//POST request
	// send the data with the body in JSON format
	@PostMapping("/")
	public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity emp) {
		System.out.println(emp);
		repo.save(emp);
		return emp;
	}
	
	//Update request
	@PutMapping("/")
	public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity  emp)
	{
		System.err.println(emp);
		repo.save(emp);
		System.err.println(emp);
		return emp;
	}
	
	//Delete Request
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable("id") int id)
	{
		System.err.println("deleted id is : "+id);
		repo.deleteById(id);
		return "Record Has been deleted !";
	}
}
