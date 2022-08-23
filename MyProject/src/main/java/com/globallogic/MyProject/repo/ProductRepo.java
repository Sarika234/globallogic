package com.globallogic.MyProject.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.MyProject.entity.ProductEntity;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {
	
	
}
