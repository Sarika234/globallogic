package com.globallogic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.entity.User;
 
public interface UserRepo extends JpaRepository<User, Integer>{

}
