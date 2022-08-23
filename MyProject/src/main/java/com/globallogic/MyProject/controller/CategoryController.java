package com.globallogic.MyProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.globallogic.MyProject.entity.CategoryEntity;
import com.globallogic.MyProject.repo.CategoryRepo;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryRepo repo;
	
	//use GET request to retrieve all the data 
	@GetMapping("/")
	public List<CategoryEntity> showCategory(){
		return repo.findAll();  //return all the rows from the table
	}
	
	//POST request
	@PostMapping("/")
	public CategoryEntity saveCategory(@RequestBody CategoryEntity category) {
		repo.save(category);
		return category;   // send the data with the body in JSON format
	}
	
	// Update request
	@PutMapping("/")
	public CategoryEntity updateProduct(@RequestBody CategoryEntity category) {
		System.err.println(category);
		repo.save(category);
		System.err.println(category);
		return category;
	}

	// Delete Request
	@DeleteMapping("/{id}")
	public String deleteCategory(@PathVariable("id") int id) {
		System.err.println("deleted id is : " + id);
		repo.deleteById(id);
		return "Record Has been deleted !";
	}

}
