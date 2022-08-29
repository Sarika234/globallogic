package com.globallogic.model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="course")
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private Date duration;
	
	@OneToMany
	List<Subject> subject;

	public Course(int id, String name, Date duration, List<Subject> subject) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.subject = subject;
	}

	public Course() {
		
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

	public Date getDuration() {
		return duration;
	}

	public void setDuration(Date duration) {
		this.duration = duration;
	}

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", duration=" + duration + ", subject=" + subject + "]";
	}
}
