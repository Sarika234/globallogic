package com.globallogic.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.model.Exam;
import com.globallogic.repo.ExamRepo;
import com.globallogic.service.ExamService;

@Component
public class ExamServiceImpl implements ExamService{
	@Autowired
	ExamRepo repo;

	@Override
	public List<Exam> getExam() {
		return repo.findAll();
	}

	@Override
	public void addExam(Exam exam) {
		repo.save(exam);
	}

	@Override
	public Exam updateExam(Exam exam) {
		repo.save(exam);
		return exam;
	}

	@Override
	public void deleteExam(int id) {
		repo.deleteById(id);
	}
}
