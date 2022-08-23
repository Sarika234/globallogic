package com.globallogic.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
