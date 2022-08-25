package com.globallogic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.entity.Employee;
import com.globallogic.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeRepo repo;

	@Override
	public List<Employee> getEmployee() {
		return repo.findAll();
	}

	@Override
	public void addEmployee(Employee emp) {
		repo.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		repo.save(emp);
		return emp;
	}

	@Override
	public void deleteEmployee(int id) {
		repo.deleteById(id);
	}

}
