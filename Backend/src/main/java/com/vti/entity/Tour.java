package com.vti.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
	
	@Column(name = "`price1`")
	private String price1;
	
	@Column(name = "`tourImage1`",length = 500)
	private String tourImage1;
	
	@Column(name = "`tourImage2`",length = 500)
	private String tourImage2;
	
	@Column(name = "`tourImage3`",length = 500)
	private String tourImage3;
	
	@Column(name = "`tourImage4`",length = 500)
	private String tourImage4;
	
	@Column(name = "`tourImage5`",length = 500)
	private String tourImage5;
	
	@Column(name = "`price2`")
	private String price2;
	
	@Column(name = "`tourManage`", length = 100)
	private String tourManage;
	
	@Column(name = "`highLight`", length = 100)
	private String highLight;
	
	@OneToMany(mappedBy = "tour")
	private List<Booking> listBooking = new ArrayList<>();
	private List<Trip> listTrip = new ArrayList<>();

	public Tour(short id, String price1, String name, String departurePlace,Date departureDay,short emptySeat, String time,String describe,String tourImage1,String tourImage2,String tourImage3,String tourImage4,String tourImage5,String price2,String tourManage,String highLight) {
		this.id = id;
		this.price1 = price1;
		this.name = name;
		this.departurePlace = departurePlace;
		this.departureDay = departureDay;
		this.emptySeat = emptySeat;
		this.time = time;
		this.describe = describe;
		this.tourImage1 = tourImage1;
		this.tourImage2 = tourImage2;
		this.tourImage3 = tourImage3;
		this.tourImage4 = tourImage4;
		this.tourImage5 = tourImage5;
		this.price2 = price2;
		this.tourManage = tourManage;
		this.highLight = highLight;
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

	public String getPrice1() {
		return price1;
	}

	public void setPrice1(String price1) {
		this.price1 = price1;
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

	public List<Booking> getListBooking() {
		return listBooking;
	}

	public void setListBooking(List<Booking> listBooking) {
		this.listBooking = listBooking;
	}

	public List<Trip> getListTrip() {
		return listTrip;
	}

	public void setListTrip(List<Trip> listTrip) {
		this.listTrip = listTrip;
	}

	@Override
	public String toString() {
		return "Tour [id=" + id + ", name=" + name + ", describe=" + describe + ", departurePlace=" + departurePlace
				+ ", departureDay=" + departureDay + ", emptySeat=" + emptySeat + ", time=" + time + ", price1="
				+ price1 + ", tourImage1=" + tourImage1 + ", tourImage2=" + tourImage2 + ", tourImage3=" + tourImage3
				+ ", tourImage4=" + tourImage4 + ", tourImage5=" + tourImage5 + ", price2=" + price2 + ", tourManage="
				+ tourManage + ", highLight=" + highLight + ", listBooking=" + listBooking + ", listTrip=" + listTrip
				+ "]";
	}

}
