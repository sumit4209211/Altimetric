package com.altimetrik.ee.demo.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "booking_details")
public class BookingDetails {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "source_city")
	private String sourceCity;
	
	@Column(name = "destination_city")
	private String destinationCity;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "reached_date")
	private Date reachedDate;
	
    @OneToOne(cascade = CascadeType.ALL)
    @Column(name = "bus_number")
	private BusDetails busNumber;
	
	@Column(name = "bus_registartion_number")
	private String busRegistartionNumber;
	
	@Column(name = "operator_name")
	private String operatorName;
	
	@Column(name = "duration_in_minutes")
	private int durationinMinutes;
	
	@Column(name = "price")
	private double price;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSourceCity() {
		return sourceCity;
	}

	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getReachedDate() {
		return reachedDate;
	}

	public void setReachedDate(Date reachedDate) {
		this.reachedDate = reachedDate;
	}

	public BusDetails getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(BusDetails busNumber) {
		this.busNumber = busNumber;
	}

	public String getBusRegistartionNumber() {
		return busRegistartionNumber;
	}

	public void setBusRegistartionNumber(String busRegistartionNumber) {
		this.busRegistartionNumber = busRegistartionNumber;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public int getDurationinMinutes() {
		return durationinMinutes;
	}

	public void setDurationinMinutes(int durationinMinutes) {
		this.durationinMinutes = durationinMinutes;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
