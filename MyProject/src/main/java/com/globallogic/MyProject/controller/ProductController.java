package com.globallogic.MyProject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.globallogic.MyProject.entity.CategoryEntity;
import com.globallogic.MyProject.entity.MerchantEntity;
import com.globallogic.MyProject.entity.ProductEntity;
import com.globallogic.MyProject.repo.CategoryRepo;
import com.globallogic.MyProject.repo.MerchantRepo;
import com.globallogic.MyProject.repo.ProductRepo;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductRepo repo;
	
	@Autowired
	CategoryRepo categoryrepo;
	
	@Autowired
	MerchantRepo merchantrepo;
	
	
	
	//use GET request to retrieve all the data 
	@GetMapping("/")
	public List<ProductEntity> showProduct(){
		return repo.findAll();   //return all the rows from the table
	}
	
	//POST request
	@PostMapping("/")
	public ProductEntity saveProduct(@RequestBody ProductEntity product) {
		System.out.println("Category: "+product.getCategory());
		
		CategoryEntity entity = categoryrepo.findById(product.getCategory().getId()).get();
		
		MerchantEntity merchantEntity = merchantrepo.findById(product.getMerchant().getGST_no()).get();
		
		System.err.println("category: "+entity);
		System.err.println("merchant: "+merchantEntity);
		
		product.setCategory(entity);
		product.setMerchant(merchantEntity);
		repo.save(product);    // send the data with the body in JSON format
		return product;
	}
	
	// Update request
	@PutMapping("/")
	public ProductEntity updateProduct(@RequestBody ProductEntity product) {
		System.err.println(product);
		repo.save(product);
		System.err.println(product);
		return product;
	}
	

	// Delete Request
	@DeleteMapping("/{id}")
	public String deleteProduct(@PathVariable("id") int id) {
		System.err.println("deleted id is : " + id);
		repo.deleteById(id);
		return "Record Has been deleted !";
	} 
	
	@GetMapping("/{id}")
	public Optional<ProductEntity> getProductbyId(@PathVariable("id") int id){
		return repo.findById(id);
	}
	
	
}
