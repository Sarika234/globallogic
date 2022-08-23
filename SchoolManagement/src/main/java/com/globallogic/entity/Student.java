package com.globallogic.entity;

import java.util.List;

import javax.persistence.*;


@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column
	String name;
	
	@Column
	String city;
	
	@OneToOne
	Register register;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Address> address;
	
	@ManyToMany
	List<Teacher> teacher;

	public Student() {
		
	}

	public Student(int id, String name, String city, Register register, List<Address> address, List<Teacher> teacher) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.register = register;
		this.address = address;
		this.teacher = teacher;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Register getRegister() {
		return register;
	}

	public void setRegister(Register register) {
		this.register = register;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public List<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", register=" + register + ", address="
				+ address + ", teacher=" + teacher + "]";
	}
}