package com.vti.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
	
	@Column(name = "`pointDeparture`", length = 100)
	private String pointDeparture;
	
	@Column(name = "`destination`", length = 100)
	private String destination;
	
	@Column(name = "`hotel`", length = 100)
	private String hotel;
	
	@Column(name = "`startDate`")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date startDate;
	
	@Column(name = "`endDate`")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date endDate;

	@Column(name = "`describe`", length = 500)
	private String describe;
	
	@Column(name = "`tripImage1`", length = 100)
	private String tripImage1;
	
	@Column(name = "`tripImage2`", length = 100)
	private String tripImage2;
	
	@Column(name = "`tripImage3`", length = 100)
	private String tripImage3;
	
	@Column(name = "`tripImage4`", length = 100)
	private String tripImage4;

	@Column(name = "`tripManage`", length = 100)
	private String tripManage;

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tour_id")
	private Tour tour;
	
	public Trip(short id, String name, String schedule, String pointDeparture, String destination,String hotel,Date startDate,Date endDate,String describe,String tripImage1,String tripImage2,String tripImage3,String tripImage4,String tripManage) {
		this.id = id;
		this.name = name;
		this.schedule = schedule;
		this.pointDeparture = pointDeparture;
		this.destination = destination;
		this.hotel = hotel;
		this.startDate = startDate;
		this.endDate = endDate;
		this.describe = describe;
		this.tripImage1 = tripImage1;
		this.tripImage2 = tripImage2;
		this.tripImage3 = tripImage3;
		this.tripImage4 = tripImage4;
		this.tripManage = tripManage;
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

	public Tour getTour() {
		return tour;
	}

	public void setTour(Tour tour) {
		this.tour = tour;
	}

	@Override
	public String toString() {
		return "Trip [id=" + id + ", name=" + name + ", schedule=" + schedule + ", pointDeparture=" + pointDeparture
				+ ", destination=" + destination + ", hotel=" + hotel + ", startDate=" + startDate + ", endDate="
				+ endDate + ", describe=" + describe + ", tripImage1=" + tripImage1 + ", tripImage2=" + tripImage2
				+ ", tripImage3=" + tripImage3 + ", tripImage4=" + tripImage4 + ", tripManage=" + tripManage + ", tour="
				+ tour + "]";
	}
}