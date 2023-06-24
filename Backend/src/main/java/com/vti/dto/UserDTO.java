package com.vti.dto;

import com.vti.entity.User;

public class UserDTO {

	// check not null, check length, check exists, check format (regex)...
	private String userName;

	// check not null, check length, check exists on database, check format
	// (regex)...
	private String email;

	// check not null, check length, check format (regex)...
	private String password;

	// check not null, check length, check format (regex)...
	private String firstName;

	// check not null, check length, check format (regex)...
	private String lastName;
	
	private String numberPhone;

	public UserDTO() {
	}

	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getNumberPhone() {
		return numberPhone;
	}


	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}


	public User toEntity() {
		return new User(userName, email, password, firstName, lastName, numberPhone);
	}
}