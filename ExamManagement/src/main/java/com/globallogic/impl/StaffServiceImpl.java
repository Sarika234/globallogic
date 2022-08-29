package com.globallogic.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.model.Staff;
import com.globallogic.repo.StaffRepo;
import com.globallogic.service.StaffService;

@Component
public class StaffServiceImpl implements StaffService{
	@Autowired
	StaffRepo repo;
	

	@Override
	public List<Staff> getStaff() {
		return repo.findAll();
	}

	@Override
	public void addStaff(Staff staff) {
		repo.save(staff);
	}

	@Override
	public Staff updateStaff(Staff staff) {
		repo.save(staff);
		return staff;
	}

	@Override
	public void deleteStaff(int id) {
		repo.deleteById(id);
	}
}
