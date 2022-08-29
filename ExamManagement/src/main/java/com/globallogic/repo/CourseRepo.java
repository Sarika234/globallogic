package com.globallogic.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.model.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer>{

}
