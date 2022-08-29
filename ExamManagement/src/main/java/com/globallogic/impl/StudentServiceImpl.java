package com.globallogic.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.model.Student;
import com.globallogic.repo.StudentRepo;
import com.globallogic.service.StudentService;

@Component
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepo repo;

	@Override
	public List<Student> getStudent() {
		return repo.findAll();
	}

	@Override
	public void addStudent(Student student) {
		repo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		repo.save(student);
		return student;
	}

	@Override
	public void deleteStudent(int id) {
		repo.deleteById(id);
	}

	@Override
	public List<Student> getStudentbyName() {
		return repo.findAll();
	}
	

}
