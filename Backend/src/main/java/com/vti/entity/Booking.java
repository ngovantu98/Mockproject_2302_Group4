package com.vti.entity;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "`Booking`")
public class Booking implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "`id`")
	private short id;

	@Column(name = "`name`", length = 50)
	private String name;
	
	@Column(name = "`status`", length = 50)
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "`tourId`")
	private Tour tour;
	
	@ManyToOne
	@JoinColumn(name = "`userId`")
	private User user;
	
	public Booking(short id, String name,String status,Tour tour) {
		this.id = id;
		this.name = name;
		this.status = status;
		this.tour = tour;
		
	}
		
	public Booking() {
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

	public Tour getTour() {
		return tour;
	}

	public void setTour(Tour tour) {
		this.tour = tour;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", name=" + name + ", status=" + status + ", tourId=" + tour + "]";
	}

	

}