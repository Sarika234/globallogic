package com.globallogic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.globallogic.model.Course;

@Service
public interface CourseService {
	
	public List<Course> getCourse();
	
	public void addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public void deleteCourse(int id);

}
