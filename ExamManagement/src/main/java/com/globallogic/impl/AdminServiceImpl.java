package com.globallogic.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.model.Admin;
import com.globallogic.repo.AdminRepo;
import com.globallogic.service.AdminService;

@Component
public class AdminServiceImpl implements AdminService{
	@Autowired
	AdminRepo repo;

	@Override
	public void addAdmin(Admin admin) {
		repo.save(admin);
	}

	@Override
	public List<Admin> getAdmin() {
		return repo.findAll();
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		repo.save(admin);
		return admin;
	}

	@Override
	public void deleteAdmin(int id) {
		repo.deleteById(id);
	}
}
