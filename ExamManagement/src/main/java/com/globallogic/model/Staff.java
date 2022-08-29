package com.globallogic.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="staff")
public class Staff {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String name;
	
	@ManyToMany
	List<Exam> exam;

	public Staff() {
		
	}

	public Staff(int id, String name, List<Exam> exam) {
		super();
		this.id = id;
		this.name = name;
		this.exam = exam;
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


	public List<Exam> getExam() {
		return exam;
	}

	public void setExam(List<Exam> exam) {
		this.exam = exam;
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", exam=" + exam + "]";
	}
}
