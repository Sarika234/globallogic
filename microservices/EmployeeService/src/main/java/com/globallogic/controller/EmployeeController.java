package com.globallogic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.globallogic.entity.Employee;
import com.globallogic.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeservice;
	
	@GetMapping("/")
	public List<Employee> getEmployee(){
		return employeeservice.getEmployee();
	}
	
	@PostMapping("/")
	public Employee addEmployee(@RequestBody Employee emp){
		employeeservice.addEmployee(emp);
		return emp;
	}
	
	@PutMapping("/")
	public Employee updateEmployee(@RequestBody Employee emp){
		return employeeservice.updateEmployee(emp);
	}
	
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable("id") int id){
		employeeservice.deleteEmployee(id);
		return "Record has been deleted!";
	}

}
