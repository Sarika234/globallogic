package com.globallogic.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="exam")
public class Exam {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private int no_of_questions;
	
	@Column
	private int duration;
	
	@Column
	private String status;
	
	@OneToMany
	List<Paper> paper;

	
	public Exam(int id, String name, int no_of_questions, int duration, String status, List<Paper> paper) {
		super();
		this.id = id;
		this.name = name;
		this.no_of_questions = no_of_questions;
		this.duration = duration;
		this.status = status;
		this.paper = paper;
	}

	public Exam() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Paper> getPaper() {
		return paper;
	}

	public void setPaper(List<Paper> paper) {
		this.paper = paper;
	}
	
	
	public int getNo_of_questions() {
		return no_of_questions;
	}

	public void setNo_of_questions(int no_of_questions) {
		this.no_of_questions = no_of_questions;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Exam [id=" + id + ", name=" + name + ", no_of_questions=" + no_of_questions + ", duration=" + duration
				+ ", status=" + status + ", paper=" + paper + "]";
	}
}
