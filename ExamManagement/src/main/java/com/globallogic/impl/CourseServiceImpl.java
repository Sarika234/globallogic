package com.globallogic.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.model.Course;
import com.globallogic.repo.CourseRepo;
import com.globallogic.service.CourseService;

@Component
public class CourseServiceImpl implements CourseService{
	@Autowired
	CourseRepo repo;

	@Override
	public List<Course> getCourse() {
		return repo.findAll();
	}

	@Override
	public void addCourse(Course course) {
		repo.save(course);
	}

	@Override
	public Course updateCourse(Course course) {
		repo.save(course);
		return course;
	}

	@Override
	public void deleteCourse(int id) {
		repo.deleteById(id);
	}
}
