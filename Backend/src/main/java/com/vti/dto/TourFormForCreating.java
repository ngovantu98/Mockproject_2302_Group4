package com.vti.dto;

import java.util.Date;
import com.vti.entity.Tour;

public class TourFormForCreating {

	private short id;
	private String name;
	private String departurePlace;
	private short emptySeat;
	private Date departureDay;
	private String describe;

	public TourFormForCreating() {
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

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public Tour toEntity() {
		return new Tour(id, name, departurePlace, departureDay, emptySeat,describe);
	}

}
