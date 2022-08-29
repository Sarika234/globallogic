package com.globallogic.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.model.Paper;

@Repository
public interface PaperRepo extends JpaRepository<Paper, Integer>{

}
