package com.globallogic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.entity.Dept;
import com.globallogic.repo.DeptRepo;

@Service
public class DeptServiceImpl implements DeptService {
	
	@Autowired
	DeptRepo repo;

	@Override
	public List<Dept> getDept() {
		return repo.findAll();
	}

	@Override
	public void addDept(Dept dept) {
		repo.save(dept);
	}

	@Override
	public Dept updateDept(Dept dept) {
		repo.save(dept);
		return dept;
	}

	@Override
	public void deleteDept(int id) {
		repo.deleteById(id);
	}

}
