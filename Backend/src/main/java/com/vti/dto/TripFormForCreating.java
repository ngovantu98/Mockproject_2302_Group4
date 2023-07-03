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
	private Date startDate;
	private Date endDate;
	private String describe;
	private String tripImage1;
	private String tripImage2;
	private String tripImage3;
	private String tripImage4;
	private String tripManage;
	
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

	public String getTripImage1() {
		return tripImage1;
	}

	public void setTripImage1(String tripImage1) {
		this.tripImage1 = tripImage1;
	}
	
	public String getTripImage2() {
		return tripImage2;
	}
	
	public void setTripImage2(String tripImage2) {
		this.tripImage2 = tripImage2;
	}

	public String getTripImage3() {
		return tripImage3;
	}

	public void setTripImage3(String tripImage3) {
		this.tripImage3 = tripImage3;
	}

	public String getTripImage4() {
		return tripImage4;
	}

	public void setTripImage4(String tripImage4) {
		this.tripImage4 = tripImage4;
	}

	public String getTripManage() {
		return tripManage;
	}
	public void setTripManage(String tripManage) {
		this.tripManage = tripManage;
	}

	public Trip toEntity() {
		return new Trip(id, name, schedule, pointDeparture, destination, hotel, endDate, startDate, describe, tripImage1,tripImage2,tripImage3,tripImage4, tripManage);
	}
}
