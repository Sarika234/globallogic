package com.globallogic.MyProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.MyProject.entity.CustomerEntity;

public interface CustomerRepo extends JpaRepository<CustomerEntity, Integer> {

}
