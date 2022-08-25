package com.globallogic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.globallogic.entity.Dept;


@Service
public interface DeptService {
	
	public List<Dept> getDept();
	
	public void addDept(Dept dept);
	
	public Dept updateDept(Dept dept);

	public void deleteDept(int id);

}
