package com.globallogic.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.model.Subject;
import com.globallogic.repo.SubjectRepo;
import com.globallogic.service.SubjectService;

@Component
public class SubjectServiceImpl implements SubjectService {
	@Autowired
	SubjectRepo repo;

	@Override
	public void addSubject(Subject subject) {
		repo.save(subject);
	}

	@Override
	public List<Subject> getSubject() {
		return repo.findAll();
	}

	@Override
	public Subject updateSubject(Subject subject) {
		repo.save(subject);
		return subject;
	}

	@Override
	public void deleteSubject(int id) {
		repo.deleteById(id);
	}
}
