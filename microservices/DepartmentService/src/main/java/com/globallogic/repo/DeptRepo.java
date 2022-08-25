package com.globallogic.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.entity.Dept;

@Repository
public interface DeptRepo extends JpaRepository<Dept, Integer> {

}
