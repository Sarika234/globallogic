package com.globallogic.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.model.Subject;

@Repository
public interface SubjectRepo extends JpaRepository<Subject, Integer>{

}
