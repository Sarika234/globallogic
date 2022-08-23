package com.globallogic.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.crud.entity.EmployeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer>{
	
}
