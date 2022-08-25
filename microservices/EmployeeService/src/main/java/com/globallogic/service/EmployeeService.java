package com.globallogic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.globallogic.entity.Employee;

@Service
public interface EmployeeService {
	
	public List<Employee> getEmployee();
	
	public void addEmployee(Employee emp);
	
	public Employee updateEmployee(Employee emp);
	
	public void deleteEmployee(int id);
}
