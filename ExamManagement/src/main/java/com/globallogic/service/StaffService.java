package com.globallogic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.globallogic.model.Staff;

@Service
public interface StaffService {
	
	public List<Staff> getStaff();
	
	public void addStaff(Staff staff);
	
	public Staff updateStaff(Staff staff);
	
	public void deleteStaff(int id);

}
