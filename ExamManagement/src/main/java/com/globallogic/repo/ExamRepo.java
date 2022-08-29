package com.globallogic.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.model.Exam;

@Repository
public interface ExamRepo extends JpaRepository<Exam, Integer> {

}
