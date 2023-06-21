package com.vti.dto;


import java.util.Date;

import com.vti.entity.Trip;

public class TripFormForCreating {

	private short id;
	private String name;
	private String schedule;
	private String pointDeparture;
	private String destination;
	private String hotel;
	private short totalMember;
	private Date startDate;
	private Date endDate;
	private String describe;
	
	public TripFormForCreating() {
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

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public String getPointDeparture() {
		return pointDeparture;
	}

	public void setPointDeparture(String pointDeparture) {
		this.pointDeparture = pointDeparture;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getHotel() {
		return hotel;
	}

	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	public short getTotalMember() {
		return totalMember;
	}

	public void setTotalMember(short totalMember) {
		this.totalMember = totalMember;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public Trip toEntity() {
		return new Trip(id, name, schedule, pointDeparture, destination, hotel, endDate, startDate, totalMember, describe);
	}
}
