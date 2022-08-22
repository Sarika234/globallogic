package com.globallogic.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.*;

import com.globallogic.entity.Book;
import com.globallogic.entity.User;
import com.globallogic.repository.BookRepo;
import com.globallogic.repository.UserRepo;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserRepo repo;
	
	@Autowired
	BookRepo bookrepo;
	
	@Autowired
	JavaMailSender sender;
	
	@GetMapping("/")
	public List<User> showUser(){
		return repo.findAll();
	}
	
	@PostMapping("/buy")
	public String saveUser(@RequestBody User user) {
		
		List<Book> book = new ArrayList<>();
		for(Book a:user.getBook()) {
			Book b = bookrepo.findById(a.getId()).get();
			book.add(b);
		}
		user.setBook(book);
		repo.save(user);
		
		MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        
        try {
        	helper.setFrom("keycloaklogin2@gmail.com");
        	helper.setTo("sarikadharmani@gmail.com");
            helper.setText("Your order has been placed");
            helper.setSubject("Order Placed From BookStore");
        }
        
        catch (MessagingException e) {
            e.printStackTrace();
            return "Error while sending mail ..";
        }
        sender.send(message);
        
		return "User record has been saved successfully and mail is sent";
	}
	
	@PutMapping("/")
	public String updateUser(@RequestBody User user) {
		repo.save(user);
		return "User Profile has been updated!";
	}
	
	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable("id") int id) {
		repo.deleteById(id);
		return "User has been deleted!";
	}
	
	@GetMapping("/id/{id}")
	public Book getBookbyId(@PathVariable("id") int id) {
		return bookrepo.findById(id).get();
	}
	
	@GetMapping("/name/{name}")
	public List<Book> getBookbyName(@PathVariable("name") String name) {
		List<Book> book = bookrepo.findAll();
		
		List<Book> bookName = book.stream().filter(e -> (e.getTitle().equalsIgnoreCase(name))).collect(Collectors.toList());
		
		return bookName;
	}
	
	@GetMapping("/category/{category}")
	public List<Book> getBookbyCategory(@PathVariable("category") String name){
		List<Book> book = bookrepo.findAll();
		
		List<Book> cat = book.stream().filter(e -> (e.getCategory().getName().equalsIgnoreCase(name))).collect(Collectors.toList());
		return cat;
	}

}
