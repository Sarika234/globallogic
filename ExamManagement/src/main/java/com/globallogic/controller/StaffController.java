package com.globallogic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.globallogic.model.Course;
import com.globallogic.model.Paper;
import com.globallogic.model.Staff;
import com.globallogic.model.Student;

import com.globallogic.repo.CourseRepo;

import com.globallogic.service.PaperService;
import com.globallogic.service.StaffService;
import com.globallogic.service.StudentService;

@RestController
@RequestMapping("/staff")
public class StaffController {
	
	@Autowired
	CourseRepo courserepo;
	
	@Autowired
	StudentService studentservice;
	
	@Autowired
	PaperService paperservice;
	
	@Autowired
	StaffService staffservice;
	
	@GetMapping("/")
	public List<Staff> getStaff(){
		return staffservice.getStaff();
	}
	
	@PostMapping("/newAdmission")
	public String addStudent(@RequestBody Student student) {
		
		List<Course> course = new ArrayList<>();
		for(Course a:student.getCourse()) {
			Course s = courserepo.findById(a.getId()).get();
			course.add(s);
		}
		student.setCourse(course);
		studentservice.addStudent(student);
		return "New Student has been admitted!";
	}
	
	@PostMapping("/addQuestion")
	public String addPaper(@RequestBody Paper paper) {
		paperservice.addPaper(paper);
		return "New Question has been added!";
	}
	
	@GetMapping("/students")
	public List<String> getStudentbyName(){
		List<Student> student = studentservice.getStudentbyName();
		
		List<String> name = new ArrayList<>();
		
		for(Student a: student) {
			name.add(a.getName());
		}
		return name ;
	}

	@PutMapping("/")
	public Staff updateStaff(@RequestBody Staff staff) {
		staffservice.updateStaff(staff);
		return staff;
	}
	 
}
