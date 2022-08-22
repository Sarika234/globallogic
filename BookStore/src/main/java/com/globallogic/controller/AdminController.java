package com.globallogic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.globallogic.entity.Admin;
import com.globallogic.entity.Book;
import com.globallogic.entity.Category;
import com.globallogic.repository.AdminRepo;
import com.globallogic.repository.BookRepo;
import com.globallogic.repository.CategoryRepo;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminRepo repo;
	
	@Autowired
	BookRepo bookrepo;
	
	@Autowired
	CategoryRepo categoryrepo;
	
	
	@GetMapping("/")
	public List<Admin> showAdmin(){
		return repo.findAll();
	}
	
	@PostMapping("/")
	public String saveAdmin(@RequestBody Admin admin) {
		
		List<Book> b = new ArrayList<>();
		for(Book a:admin.getBook()) {
			Book book = bookrepo.findById(a.getId()).get();
			b.add(book);
		}
		admin.setBook(b);
		repo.save(admin);
		return "Admin is registered successfully!";
	}
	
	@PutMapping("/")
	public String updateAdmin(@RequestBody Admin admin) {
		repo.save(admin);
		return "Admin Profile has been updated successfully!";
	}
	
	@DeleteMapping("/{id}")
	public String deleteAdmin(@PathVariable("id") int id) {
		repo.deleteById(id);
		return "Admin has been deleted!";
	}
	
	@GetMapping("/show")
	public List<Book> showBook(){
		return bookrepo.findAll();
	}
	
	@PostMapping("/add")
	public Book saveBook(@RequestBody Book book) {
		Category category = categoryrepo.findById(book.getCategory().getId()).get();
		
		book.setCategory(category);
		bookrepo.save(book);
		return book;
	}
	
	@PutMapping("/sell")
	public Book updateBook(@RequestBody Book book) {
		bookrepo.save(book);
		return book;
	}
	
	@DeleteMapping("/sold/{id}")
	public String deleteBook(@PathVariable("id") int id) {
		repo.deleteById(id);
		return "Record has been deleted!";
	}
	
}
