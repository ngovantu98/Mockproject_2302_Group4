package com.vti.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name = "`Trip`")
public class Trip implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "`id`")
	private short id;

	@Column(name = "`name`", length = 100)
	private String name;          
	
	@Column(name = "`schedule`", length = 1500)
	private String schedule;
	
	@Column(name = "`tripImage1`", length = 500)
	private String tripImage1;
	
	@Column(name = "`tripImage2`", length = 500)
	private String tripImage2;
	
	@Column(name = "`tripImage3`", length = 500)
	private String tripImage3;
	
	@Column(name = "`tripImage4`", length = 500)
	private String tripImage4;

	private short tourId;

	public Trip(short id, String name, String schedule,String tripImage1,String tripImage2,String tripImage3,String tripImage4,short tourId) {
		this.id = id;
		this.name = name;
		this.schedule = schedule;
		this.tripImage1 = tripImage1;
		this.tripImage2 = tripImage2;
		this.tripImage3 = tripImage3;
		this.tripImage4 = tripImage4;
		this.tourId = tourId;
	}

	public Trip() {
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
		return "Trip [id=" + id + ", name=" + name + ", schedule=" + schedule + ", tripImage1=" + tripImage1
				+ ", tripImage2=" + tripImage2 + ", tripImage3=" + tripImage3 + ", tripImage4=" + tripImage4
				+ ", tourId=" + tourId + "]";
	}

}