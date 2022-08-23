package com.globallogic.entity;

import javax.persistence.*;

@Entity
@Table(name="register")
public class Register {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	
	@Column
	long rollno;
	
	@Column
	double fees;

	public Register() {

	}

	public Register(long id, long rollno, double fees) {
		super();
		this.id = id;
		this.rollno = rollno;
		this.fees = fees;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getRollno() {
		return rollno;
	}

	public void setRollno(long rollno) {
		this.rollno = rollno;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Register [id=" + id + ", rollno=" + rollno + ", fees=" + fees + "]";
	}
}
