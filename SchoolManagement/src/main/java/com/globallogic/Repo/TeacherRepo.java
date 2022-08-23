package com.globallogic.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.entity.Teacher;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Long>{

}
