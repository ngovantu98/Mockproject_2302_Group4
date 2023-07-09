package com.vti.dto;

import java.io.Serializable;
import java.util.Date;

public class TripDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private short id;

	private String name;          
	
	private String schedule;
	
	private String tripImage1;
	
	private String tripImage2;
	
	private String tripImage3;
	
	private String tripImage4;

	private short tourId;

	public TripDTO(short id, String name, String schedule, String tripImage1,String tripImage2,String tripImage3,String tripImage4,short tourId) {
		this.id = id;
		this.name = name;
		this.schedule = schedule;
		this.tripImage1 = tripImage1;
		this.tripImage2 = tripImage2;
		this.tripImage3 = tripImage3;
		this.tripImage4 = tripImage4;
	
		this.tourId = tourId;
	}

	public TripDTO() {
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


	public short getTourId() {
		return tourId;
	}

	public void setTourId(short tourId) {
		this.tourId = tourId;
	}

	@Override
	public String toString() {
		return "TripDTO [id=" + id + ", name=" + name + ", schedule=" + schedule + ", tripImage1=" + tripImage1
				+ ", tripImage2=" + tripImage2 + ", tripImage3=" + tripImage3 + ", tripImage4=" + tripImage4
				+ ", tourId=" + tourId + "]";
	}

}