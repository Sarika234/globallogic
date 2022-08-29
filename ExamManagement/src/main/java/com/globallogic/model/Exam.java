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
	
	@OneToMany
	List<Paper> paper;

	public Exam(int id, String name, List<Paper> paper) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Exam [id=" + id + ", name=" + name + ", paper=" + paper + "]";
	}
}
