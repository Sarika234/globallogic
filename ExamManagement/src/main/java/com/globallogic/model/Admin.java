package com.globallogic.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="admin")
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String name;
	
	@OneToMany
	List<Student> student;
	
	@OneToMany
	List<Staff> staff;

	public Admin() {
		
	}

	public Admin(int id, String name, List<Student> student, List<Staff> staff) {
		super();
		this.id = id;
		this.name = name;
		this.student = student;
		this.staff = staff;
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

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public List<Staff> getStaff() {
		return staff;
	}

	public void setStaff(List<Staff> staff) {
		this.staff = staff;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", student=" + student + ", staff=" + staff + "]";
	}
}
