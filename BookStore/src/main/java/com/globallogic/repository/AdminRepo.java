package com.globallogic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {

}
