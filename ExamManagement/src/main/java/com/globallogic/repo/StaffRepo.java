package com.globallogic.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.model.Staff;

@Repository
public interface StaffRepo extends JpaRepository<Staff, Integer>{

}
