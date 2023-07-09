package com.vti.dto;

import com.vti.entity.Advise;

public class AdviseFormForCreating {

	private short id;
	private String name;
	private String email;
	private String phone;
	private String information;
	
	public short getId() {
		return id;
	}
	
	public void setId(short id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public Advise toEntity() {
		return new Advise(id,name,email,phone,information);
	}

}

