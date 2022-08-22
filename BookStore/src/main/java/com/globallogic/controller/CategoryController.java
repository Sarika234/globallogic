package com.globallogic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.globallogic.entity.Category;
import com.globallogic.repository.CategoryRepo;

@RestController
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	CategoryRepo repo;
	
	@GetMapping("/")
	public List<Category> showCategory(){
		return repo.findAll();
	}
	
	@PostMapping("/")
	public Category saveCategory(@RequestBody Category category) {
		repo.save(category);
		return category;
	}
	
	@PutMapping("/")
	public Category updateCategory(@RequestBody Category category) {
		repo.save(category);
		return category;
	}
	
	@DeleteMapping("/{id}")
	public String deleteCategory(@PathVariable("id") int id) {
		repo.deleteById(id);
		return "Record has been deleted!";
	}
}
