package com.globallogic.MyProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.MyProject.entity.MerchantEntity;

public interface MerchantRepo extends JpaRepository<MerchantEntity, Integer> {

}
