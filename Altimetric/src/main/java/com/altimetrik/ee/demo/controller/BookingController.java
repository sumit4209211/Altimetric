package com.altimetrik.ee.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.ee.demo.entity.BookingDetails;
import com.altimetrik.ee.demo.entity.BusDetails;
import com.altimetrik.ee.demo.service.BookingService;

@RestController
@RequestMapping(value = "/booking")
public class BookingController {


	protected static Logger logger = LoggerFactory.getLogger(BookingController.class.getName());

	@Value("${spring.application.name}")
	private String applicationName;

	@Autowired
	private BookingService bookingService;

	
	@PostMapping(value = "/searchBuses")
	public List<BookingDetails> findBusDetails(@RequestBody BookingDetails bookingDetails) {
		return bookingService.findBusDetails(bookingDetails);
	}

	@PostMapping(value = "/bookTicket")
	public String bookTicket(@RequestBody BusDetails busDetails) {
		return bookingService.bookTicket(busDetails);
	}


}
