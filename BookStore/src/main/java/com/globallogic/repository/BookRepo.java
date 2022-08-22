package com.globallogic.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {
	
}
