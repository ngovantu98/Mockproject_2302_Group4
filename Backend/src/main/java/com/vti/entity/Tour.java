package com.vti.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "`Tour`")
public class Tour implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;
	
	@Column(name = "`name`", length = 500)
	private String name;
	
	@Column(name = "`describe`",length = 500)
	private String describe;
	
	//Nơi khởi hành
	@Column(name = "`departurePlace`", length = 100)
	private String departurePlace;
	
	//Ngày khời hành
	@Column(name = "`departureDay`")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date departureDay;
	
	//Mô tả chi tiết
	//ghế trống
	@Column(name = "`emptySeat`")
	private short emptySeat;
	
	@Column(name = "`time`",length = 100)
	private String time;
	
	@Column(name = "`price`")
	private String price;
	
	@Column(name = "`tourImage`",length = 100)
	private String tourImage;
	
	@OneToMany(mappedBy = "tour")
	private List<Trip> trips;

	public Tour(short id, String price, String name, String departurePlace,Date departureDay,short emptySeat, String time,String describe,String tourImage) {
		this.id = id;
		this.price = price;
		this.name = name;
		this.departurePlace = departurePlace;
		this.departureDay = departureDay;
		this.emptySeat = emptySeat;
		this.time = time;
		this.describe = describe;
		this.tourImage = tourImage;
	}

	public Tour() {
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

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getDeparturePlace() {
		return departurePlace;
	}

	public void setDeparturePlace(String departurePlace) {
		this.departurePlace = departurePlace;
	}

	public Date getDepartureDay() {
		return departureDay;
	}

	public void setDepartureDay(Date departureDay) {
		this.departureDay = departureDay;
	}

	public short getEmptySeat() {
		return emptySeat;
	}

	public void setEmptySeat(short emptySeat) {
		this.emptySeat = emptySeat;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getTourImage() {
		return tourImage;
	}

	public void setTourImage(String tourImage) {
		this.tourImage = tourImage;
	}

	public List<Trip> getTrips() {
		return trips;
	}

	public void setTrips(List<Trip> trips) {
		this.trips = trips;
	}

	@Override
	public String toString() {
		return "Tour [id=" + id + ", name=" + name + ", describe=" + describe + ", departurePlace=" + departurePlace
				+ ", departureDay=" + departureDay + ", emptySeat=" + emptySeat + ", time=" + time + ", price=" + price
				+ ", tourImage=" + tourImage + ", trips=" + trips + "]";
	}

}
