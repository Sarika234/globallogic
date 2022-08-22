package com.globallogic.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.globallogic.entity.Book;
import com.globallogic.entity.Category;
import com.globallogic.repository.BookRepo;
import com.globallogic.repository.CategoryRepo;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	BookRepo repo;
	
	@Autowired
	CategoryRepo categoryrepo;
	
	@GetMapping("/")
	public List<Book> showBook(){
		return repo.findAll();
	}
	
	@PostMapping("/")
	public Book saveBook(@RequestBody Book book) {
		Category category = categoryrepo.findById(book.getCategory().getId()).get();
		
		book.setCategory(category);
		repo.save(book);
		return book;
	}
	
	@PutMapping("/")
	public Book updateBook(@RequestBody Book book) {
		repo.save(book);
		return book;
	}
	
	@DeleteMapping("/{id}")
	public String deleteBook(@PathVariable("id") int id) {
		repo.deleteById(id);
		return "Record has been deleted!";
	}
	
	@GetMapping("/id/{id}")
	public Book getBookbyId(@PathVariable("id") int id) {
		return repo.findById(id).get();
	}
	
	@GetMapping("/name/{name}")
	public List<Book> getBookbyName(@PathVariable("name") String name) {
		List<Book> book = repo.findAll();
		
		List<Book> bookName = book.stream().filter(e -> (e.getTitle().equalsIgnoreCase(name))).collect(Collectors.toList());
		
		return bookName;
	}
	
	@GetMapping("/category/{category}")
	public List<Book> getBookbyCategory(@PathVariable("category") String name){
		List<Book> book = repo.findAll();
		
		List<Book> cat = book.stream().filter(e -> (e.getCategory().getName().equalsIgnoreCase(name))).collect(Collectors.toList());
		return cat;
	}

}
