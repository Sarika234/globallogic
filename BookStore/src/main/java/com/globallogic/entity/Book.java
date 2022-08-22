package com.globallogic.entity;

import javax.persistence.*;

@Entity
@Table(name="book")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String title;
	
	@Column
	private double cost;
	
	@Column
	private String author;
	
	@OneToOne
	private Category category;

	public Book() {
		
	}

	public Book(int id, String title, double cost, String author, Category category) {
		super();
		this.id = id;
		this.title = title;
		this.cost = cost;
		this.author = author;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", cost=" + cost + ", author=" + author + ", category="
				+ category + "]";
	}
}
