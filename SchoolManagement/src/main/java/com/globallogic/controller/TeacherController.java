package com.globallogic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.globallogic.Repo.TeacherRepo;
import com.globallogic.entity.Teacher;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
	@Autowired
	TeacherRepo repo;
	
	@GetMapping("/")
	public List<Teacher> showTeacher(){
		return repo.findAll();
	}
	
	@PostMapping("/")
	public Teacher saveTeacher(@RequestBody Teacher teacher) {
		repo.save(teacher);
		return teacher;
	}
	
	@PutMapping("/")
	public Teacher updateTeacher(@RequestBody Teacher teacher) {
		repo.save(teacher);
		return teacher;
	}
	
	@DeleteMapping("/{id}")
	public String deleteTeacher(@PathVariable("id") long id) {
		repo.deleteById(id);
		return "Record has been deleted!";
	}


}
