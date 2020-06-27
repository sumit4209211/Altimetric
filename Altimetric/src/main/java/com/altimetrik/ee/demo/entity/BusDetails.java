package com.altimetrik.ee.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking_details")
public class BusDetails {

	@Id
	@Column(name = "bus_number")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long busNumber;

	@Column(name = "seat_capacity")
	private int seatCapacity;
	
	@Column(name = "seat_details")
	private String seatDetails; // In DataBase Need to maintain in JSON format
	
	@Column(name = "bus_type")
	private String busType;
	
	@Column(name = "operator_name")
	private String operatorName;
	
	@Column(name = "operator_number")
	private String operatorNumber;

	public Long getBusNumber() {
		return busNumber;
	}

	public void setId(Long busNumber) {
		this.busNumber = busNumber;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	public String getSeatDetails() {
		return seatDetails;
	}

	public void setSeatDetails(String seatDetails) {
		this.seatDetails = seatDetails;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getOperatorNumber() {
		return operatorNumber;
	}

	public void setOperatorNumber(String operatorNumber) {
		this.operatorNumber = operatorNumber;
	}

}
