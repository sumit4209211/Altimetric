package com.altimetrik.ee.demo.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.altimetrik.ee.demo.entity.BookingDetails;
import com.altimetrik.ee.demo.entity.BusDetails;

@Service
public interface BookingService {

	List<BookingDetails> findBusDetails(BookingDetails bookingDetails);
	String bookTicket(BusDetails busDetails);

}
