package com.globallogic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.globallogic.entity.Dept;
import com.globallogic.service.DeptService;

@RestController
@RequestMapping("/dept")
public class DeptController {
	@Autowired 
	DeptService deptservice;
	
	@GetMapping("/")
	public List<Dept> getDept(){
		return deptservice.getDept();
	}
	
	@PostMapping("/")
	public String addDept(@RequestBody Dept dept){
		deptservice.addDept(dept);
		return "Record has been added!";
	}
	
	@PutMapping("/")
	public Dept updateDept(@RequestBody Dept dept) {
		deptservice.updateDept(dept);
		return dept;
	}
	
	@DeleteMapping("/{id}")
	public String deleteDept(@PathVariable("id") int id) {
		deptservice.deleteDept(id);
		return "Record has been deleted!";
	}
}
