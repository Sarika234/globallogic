package com.globallogic.MyProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class CategoryEntity {
	
	
	@Override
	public String toString() {
		return "CategoryEntity [id=" + id + ", name=" + name + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String name;

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
	
	
	public CategoryEntity(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public CategoryEntity() {
		
	}

}

