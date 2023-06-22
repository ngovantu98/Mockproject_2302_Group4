package com.vti.entity;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

	@Column(name = "`name`", length = 50)
	private String name;
	
	//Nơi khởi hành
	@Column(name = "`departurePlace`", length = 50)
	private String departurePlace;
	
	//Ngày khời hành
	@Column(name = "`departureDay`")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date departureDay;
	
	//Mô tả chi tiết
	@Column(name = "`describe`", length = 500)
	private String describe;

	//ghế trống
	@Column(name = "emptySeat")
	private short emptySeat;
	
	public Tour(short id, String name, String departurePlace,Date departureDay,short emptySeat,String describe) {
		this.id = id;
		this.name = name;
		this.departurePlace = departurePlace;
		this.departureDay = departureDay;
		this.emptySeat = emptySeat;
		this.describe = describe;
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

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public short getEmptySeat() {
		return emptySeat;
	}

	public void setEmptySeat(short emptySeat) {
		this.emptySeat = emptySeat;
	}

	@Override
	public String toString() {
		return "Tour [id=" + id + ", name=" + name + ", departurePlace=" + departurePlace + ", departureDay="
				+ departureDay + ", describe=" + describe + ", emptySeat=" + emptySeat + "]";
	}
}
