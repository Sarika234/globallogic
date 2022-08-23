package com.globallogic.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.entity.Register;

@Repository
public interface RegisterRepo extends JpaRepository<Register, Long> {

}
