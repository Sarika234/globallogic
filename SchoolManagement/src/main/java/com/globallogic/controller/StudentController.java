package com.globallogic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.globallogic.Repo.AddressRepo;
import com.globallogic.Repo.RegisterRepo;
import com.globallogic.Repo.StudentRepo;
import com.globallogic.Repo.TeacherRepo;
import com.globallogic.entity.Address;
import com.globallogic.entity.Register;
import com.globallogic.entity.Student;
import com.globallogic.entity.Teacher;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentRepo repo;
	
	@Autowired
	RegisterRepo registerrepo;
	
	@Autowired
	AddressRepo addressrepo;
	
	@Autowired
	TeacherRepo teacherrepo;
	
	@GetMapping("/")
	public List<Student> showStudent(){
		return repo.findAll();
	}
	@PostMapping("/")
	public Student saveStudent(@RequestBody Student student) {
		Register register = registerrepo.findById(student.getRegister().getId()).get();
		
		List<Address> add = new ArrayList<>();
		for(Address a:student.getAddress()) {
			Address address = addressrepo.findById(a.getId()).get();
			add.add(address);
		}
		
		List<Teacher> teach = new ArrayList<>();
		for(Teacher a:student.getTeacher()) {
			Teacher teacher = teacherrepo.findById(a.getId()).get();
			teach.add(teacher);
		}
		student.setTeacher(teach);
		student.setRegister(register);
		student.setAddress(add);
		repo.save(student);
		return student;
		
	}
	
	@PutMapping("/")
	public Student updateStudent(@RequestBody Student student) {
		repo.save(student);
		return student;
		
	}
	
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		repo.deleteById(id);
		return "Record has been deleted!";
	}

}
