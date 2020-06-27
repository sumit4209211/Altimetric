package com.altimetrik.ee.demo.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.altimetrik.ee.demo.entity.BookingDetails;
import com.altimetrik.ee.demo.entity.BusDetails;
import com.altimetrik.ee.demo.repository.BookingRepository;
import com.altimetrik.ee.demo.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {

	protected static Logger logger = LoggerFactory.getLogger(ComponentDetailsServiceImpl.class.getName());

	@Value("${spring.application.name}")
	private String applicationName;

	@Autowired
	private BookingRepository bookingRepository;

	@Override
	public List<BookingDetails> findBusDetails(BookingDetails bookingDetails) {
		// TODO Auto-generated method stub
		return bookingRepository.getSearchDetails(bookingDetails.getSourceCity(),bookingDetails.getDestinationCity(),bookingDetails.getStartDate(),bookingDetails.getReachedDate());
	}

	@Override
	public String bookTicket(BusDetails busDetails) {
		// TODO Auto-generated method stub
		return bookingRepository.saveBookingDetails(busDetails.getSeatDetails(),busDetails.getBusNumber());
	}


}
