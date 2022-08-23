package com.globallogic.entity;

import javax.persistence.*;

@Entity
@Table(name="address")
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	
	@Column
	String city;
	
	@Column
	int pincode;
	
	public Address() {
		
	}

	public Address(long id, String city, int pincode) {
		super();
		this.id = id;
		this.city = city;
		this.pincode = pincode;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", pincode=" + pincode + "]";
	}
}
