package com.globallogic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.globallogic.Repo.RegisterRepo;
import com.globallogic.entity.Register;

@RestController
@RequestMapping("/register")
public class RegisterController {
	@Autowired
	RegisterRepo repo;
	
	@GetMapping("/")
	public List<Register> showRegister(){
		return repo.findAll();
	}
	
	@PostMapping("/")
	public Register saveRegister(@RequestBody Register register) {
		repo.save(register);
		return register;
	}
	
	@PutMapping("/")
	public Register updateRegister(@RequestBody Register register) {
		repo.save(register);
		return register;
	}
	
	@DeleteMapping("/{id}")
	public String deleteRegister(@PathVariable("id") long id) {
		repo.deleteById(id);
		return "Record has been deleted!";
	}

}
