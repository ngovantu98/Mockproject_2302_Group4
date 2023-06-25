package com.vti.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.vti.entity.Booking;
import com.vti.entity.Tour;
import com.vti.entity.Trip;

public class BookingFormForCreating {

	private short id;
	private String name;
	private String status;
	private BigDecimal price;
	private short totalMember;


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

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public short getTotalMember() {
		return totalMember;
	}

	public void setTotalMember(short totalMember) {
		this.totalMember = totalMember;
	}

	public Booking toEntity() {
		return new Booking(id, name, status, price,totalMember);
	}
}
