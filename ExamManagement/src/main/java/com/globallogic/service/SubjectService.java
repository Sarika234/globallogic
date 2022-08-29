package com.globallogic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.globallogic.model.Subject;

@Service
public interface SubjectService {
	
	public void addSubject(Subject subject);
	
	public List<Subject> getSubject();
	
	public Subject updateSubject(Subject subject);
	
	public void deleteSubject(int id);

}
