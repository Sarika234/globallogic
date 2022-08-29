package com.globallogic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.globallogic.model.Student;
import com.globallogic.model.Subject;

import com.globallogic.service.StudentService;
import com.globallogic.service.SubjectService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentservice;
	
	@Autowired
	SubjectService subjectservice;
	
	@GetMapping("/")
	public List<Student> getStudent(){
		return studentservice.getStudent();
	}
	
	@PutMapping("/")
	public Student updateStudent(@RequestBody Student student) {
		studentservice.updateStudent(student);
		return student;
	}
	
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		studentservice.deleteStudent(id);
		return "Record has been deleted!";
	}
	
	@GetMapping("/subjects")
	public List<Subject> getSubject(){
		return subjectservice.getSubject();
	}
	
}
