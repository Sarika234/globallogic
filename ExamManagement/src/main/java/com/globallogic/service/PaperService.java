package com.globallogic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.globallogic.model.Paper;

@Service
public interface PaperService {
	
	public List<Paper> getPaper();
	
	public void addPaper(Paper paper);
	
	public Paper updatePaper(Paper paper);
	
	public void deletePaper(int id);
	

}
