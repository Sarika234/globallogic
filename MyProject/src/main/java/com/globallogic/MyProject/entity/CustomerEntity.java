package com.globallogic.MyProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class CustomerEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int cus_id;
	
	@Column
	String cus_name;
	
	@Column
	String cus_add;
	

	public CustomerEntity(int cus_id, String cus_name, String cus_add) {
		super();
		this.cus_id = cus_id;
		this.cus_name = cus_name;
		this.cus_add = cus_add;
	}

	public int getCus_id() {
		return cus_id;
	}

	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}

	public String getCus_name() {
		return cus_name;
	}

	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}

	public String getCus_add() {
		return cus_add;
	}

	public void setCus_add(String cus_add) {
		this.cus_add = cus_add;
	}

	public CustomerEntity() {
	
	}

	@Override
	public String toString() {
		return "CustomerEntity [cus_id=" + cus_id + ", cus_name=" + cus_name + ", cus_add=" + cus_add + "]";
	}	

}
