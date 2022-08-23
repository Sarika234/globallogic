package com.globallogic.MyProject.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="merchant")
public class MerchantEntity {

	@Override
	public String toString() {
		return "MerchantEntity [GST_no=" + GST_no + ", name=" + name + ", pin_code=" + pin_code + ", location="
				+ location + "]";
	}

	@Id
	private int GST_no;
	
	@Column
	private String name;
	
	@Column
	private int pin_code;
	
	@Column
	private String location;
	
	
	public MerchantEntity(int gST_no, String name, int pin_code, String location) {
		super();
		GST_no = gST_no;
		this.name = name;
		this.pin_code = pin_code;
		this.location = location;
	}

	public int getGST_no() {
		return GST_no;
	}

	public void setGST_no(int gST_no) {
		GST_no = gST_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPin_code() {
		return pin_code;
	}

	public void setPin_code(int pin_code) {
		this.pin_code = pin_code;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	

	public MerchantEntity() {
		
	}	

}
