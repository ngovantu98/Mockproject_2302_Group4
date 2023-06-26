package com.vti.dto;

import java.math.BigDecimal;
import java.util.Date;

public class TourFormForUpdating {
	
	private short id;
	private BigDecimal price;
	private String name;
	private String departurePlace;
	private short emptySeat;
	private Date departureDay;
	private String time;
	private String describe;
	private String tourImage;
	public short getId() {
		return id;
	}
	public void setId(short id) {
		this.id = id;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeparturePlace() {
		return departurePlace;
	}
	public void setDeparturePlace(String departurePlace) {
		this.departurePlace = departurePlace;
	}
	public short getEmptySeat() {
		return emptySeat;
	}
	public void setEmptySeat(short emptySeat) {
		this.emptySeat = emptySeat;
	}
	public Date getDepartureDay() {
		return departureDay;
	}
	public void setDepartureDay(Date departureDay) {
		this.departureDay = departureDay;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public String getTourImage() {
		return tourImage;
	}
	public void setTourImage(String tourImage) {
		this.tourImage = tourImage;
	}

}
