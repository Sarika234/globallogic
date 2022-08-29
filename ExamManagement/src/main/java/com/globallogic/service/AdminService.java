package com.globallogic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.globallogic.model.Admin;

@Service
public interface AdminService {
	
	public void addAdmin(Admin admin);
	
	public List<Admin> getAdmin();
	
	public Admin updateAdmin(Admin admin);
	
	public void deleteAdmin(int id);

}
