package com.vti.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
	
	@Column(name = "totalMember")
	private short totalMember;
	
	@Column(name = "price")
	private BigDecimal price;
	
	@ManyToOne
	@JoinColumn(name = "tour_id")
	private Tour tour;
//	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	public Booking(short id, String name,String status,BigDecimal price,short totalMember) {
		this.id = id;
		this.name = name;
		this.status = status;
		this.price = price;
		this.totalMember = totalMember;
		
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

	public short getTotalMember() {
		return totalMember;
	}

	public void setTotalMember(short totalMember) {
		this.totalMember = totalMember;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Tour getTour() {
		return tour;
	}

	public void setTour(Tour tour) {
		this.tour = tour;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", name=" + name + ", status=" + status + ", totalMember=" + totalMember
				+ ", price=" + price + ", tour=" + tour + ", user=" + user + "]";
	}

}