package com.globallogic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.globallogic.model.Student;

@Service
public interface StudentService {
	
	public List<Student> getStudent();
	
	public void addStudent(Student student);
	
	public Student updateStudent(Student student);
	
	public void deleteStudent(int id);
	
	public List<Student> getStudentbyName();

}
