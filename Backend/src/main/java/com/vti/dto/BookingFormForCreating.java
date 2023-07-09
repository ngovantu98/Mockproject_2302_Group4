package com.vti.dto;

import com.vti.entity.Booking;
import com.vti.entity.Tour;

public class BookingFormForCreating {

	private short id;
	private String name;
	private String status;
	private short tourId;

	public BookingFormForCreating() {
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

	public Booking toEntity() {
		return new Booking(id, name, status, new Tour());
	}
}
