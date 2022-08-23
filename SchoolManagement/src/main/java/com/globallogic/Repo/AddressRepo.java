package com.globallogic.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.globallogic.entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Long> {

}
