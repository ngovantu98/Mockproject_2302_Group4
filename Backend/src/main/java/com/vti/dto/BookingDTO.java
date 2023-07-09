package com.vti.dto;

import java.io.Serializable;


public class BookingDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private short id;
	private String name;   
	private String status;
	private short tourId;

	public BookingDTO(short id, String name,String status,short tourId) {
		this.id = id;
		this.name = name;
		this.status = status;
		this.tourId = tourId;
	}

	public BookingDTO() {
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public short getTourId() {
		return tourId;
	}

	public void setTourId(short tourId) {
		this.tourId = tourId;
	}

	@Override
	public String toString() {
		return "BookingDTO [id=" + id + ", name=" + name + ", status=" + status + ", tourId=" + tourId + "]";
	}

}