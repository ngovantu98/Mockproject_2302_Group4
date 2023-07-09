package com.vti.entity;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "`Advise`")
public class Advise implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;
	
	@Column(name = "`name`", length = 500)
	private String name;
	
	@Column(name = "`phone`",length = 500)
	private String phone;
	
	@Column(name = "`email`", length = 100)
	private String email;
	
	//Thông tin cần tư vấn
	@Column(name = "`information`",length = 1000)
	private String information;

	public Advise(short id, String name,String phone,String email,String information ) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.information = information;
		
	}
	public Advise() {
	}
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	@Override
	public String toString() {
		return "Advise [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", information="
				+ information + "]";
	}

}
