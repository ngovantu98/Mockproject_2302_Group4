package com.vti.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Formula;

@Entity
@Table(name = "`Trip`")
public class Trip implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "`id`")
	private short id;

	@Column(name = "`name`", length = 50)
	private String name;          
	
	@Column(name = "`schedule`", length = 50)
	private String schedule;
	
	@Column(name = "`pointDeparture`", length = 50)
	private String pointDeparture;
	
	@Column(name = "`destination`", length = 50)
	private String destination;
	
	@Column(name = "`hotel`", length = 50)
	private String hotel;
	
	@Column(name = "totalMember")
	private short totalMember;
	
	
	@Column(name = "`startDate`")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date startDate;
	
	@Column(name = "`endDate`")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date endDate;

	@Column(name = "`describe`", length = 50, nullable = false, unique = true)
	private String describe;
	
	public Trip(short id, String name, String schedule, String pointDeparture, String destination,String hotel,Date startDate,Date endDate,short totalMember,String describe) {
		this.id = id;
		this.name = name;
		this.schedule = schedule;
		this.pointDeparture = pointDeparture;
		this.destination = destination;
		this.hotel = hotel;
		this.startDate = startDate;
		this.endDate = endDate;
		this.totalMember = totalMember;
		this.describe = describe;
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

	@Override
	public String toString() {
		return "Trip [id=" + id + ", name=" + name + ", schedule=" + schedule + ", pointDeparture=" + pointDeparture
				+ ", destination=" + destination + ", hotel=" + hotel + ", totalMember=" + totalMember + ", startDate="
				+ startDate + ", endDate=" + endDate + ", describe=" + describe + "]";
	}
	
	
}