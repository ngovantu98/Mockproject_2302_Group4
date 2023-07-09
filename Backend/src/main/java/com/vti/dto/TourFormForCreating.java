package com.vti.dto;

import java.util.Date;
import com.vti.entity.Tour;

public class TourFormForCreating {

	private short id;
	private String price1;
	private String name;
	private String departurePlace;
	private short emptySeat;
	private Date departureDay;
	private String time;
	private String describe;
	private String tourImage1;
	private String tourImage2;
	private String tourImage3;
	private String tourImage4;
	private String tourImage5;
	private String price2;
	private String tourManage;
	private String highLight;
	
	public short getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}

	public String getPrice1() {
		return price1;
	}

	public void setPrice1(String price1) {
		this.price1 = price1;
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

	public String getTourImage1() {
		return tourImage1;
	}

	public void setTourImage1(String tourImage1) {
		this.tourImage1 = tourImage1;
	}

	public String getTourImage2() {
		return tourImage2;
	}

	public void setTourImage2(String tourImage2) {
		this.tourImage2 = tourImage2;
	}

	public String getTourImage3() {
		return tourImage3;
	}

	public void setTourImage3(String tourImage3) {
		this.tourImage3 = tourImage3;
	}

	public String getTourImage4() {
		return tourImage4;
	}

	public void setTourImage4(String tourImage4) {
		this.tourImage4 = tourImage4;
	}

	public String getTourImage5() {
		return tourImage5;
	}

	public void setTourImage5(String tourImage5) {
		this.tourImage5 = tourImage5;
	}

	public String getPrice2() {
		return price2;
	}

	public void setPrice2(String price2) {
		this.price2 = price2;
	}

	public String getTourManage() {
		return tourManage;
	}

	public void setTourManage(String tourManage) {
		this.tourManage = tourManage;
	}

	public String getHighLight() {
		return highLight;
	}

	public void setHighLight(String highLight) {
		this.highLight = highLight;
	}

	public Tour toEntity() {
		return new Tour(id, price1, name, departurePlace ,departureDay ,emptySeat ,time, describe,tourImage1,tourImage2,tourImage3,tourImage4,tourImage5,price1,tourManage,highLight);
	}

}
