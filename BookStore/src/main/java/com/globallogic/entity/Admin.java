package com.globallogic.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="admin")
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String emailId;
	
	@Column
	private String adminId;
	
	@Column
	private String password;
	
	@OneToMany
	private List<Book> book;

	public Admin() {
		
	}

	public Admin(int id, String emailId, String adminId, String password, List<Book> book) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.adminId = adminId;
		this.password = password;
		this.book = book;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", emailId=" + emailId + ", adminId=" + adminId + ", password=" + password
				+ ", book=" + book + "]";
	}
}
