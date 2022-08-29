package com.globallogic.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.model.Paper;
import com.globallogic.repo.PaperRepo;
import com.globallogic.service.PaperService;

@Component
public class PaperServiceImpl implements PaperService {
	@Autowired
	PaperRepo repo;

	@Override
	public List<Paper> getPaper() {
		return repo.findAll();
	}

	@Override
	public void addPaper(Paper paper) {
		repo.save(paper);
	}

	@Override
	public Paper updatePaper(Paper paper) {
		repo.save(paper);
		return paper;
	}

	@Override
	public void deletePaper(int id) {
		repo.deleteById(id);
	}
}
