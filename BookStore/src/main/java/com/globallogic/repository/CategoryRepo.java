package com.globallogic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
