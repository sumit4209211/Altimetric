package com.altimetrik.ee.demo.repository;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.altimetrik.ee.demo.entity.BookingDetails;

@Repository
public interface BookingRepository extends JpaRepository<BookingDetails, Long> {

	
	@Query("SELECT * FROM BookingDetails b WHERE ((b.sourceCity = (:sourceCity) and b.destinationCity = (:destinationCity) and  b.startDate = (:startDate))||(b.sourceCity = (:destinationCity) and b.destinationCity = (:sourceCity) and  b.startDate = (:returnDate))")
	List<BookingDetails> getSearchDetails(@Param("sourceCity") final String sourceCity,@Param("destinationCity") final String destinationCity,@Param("sourceCity") final Date startDate,@Param("sourceCity") final Date returnDate);

	@Query("Update BusDetails set seatDetails=:seatDetails  WHERE busNumber = :busNumber")
	String saveBookingDetails(@Param("seatDetails") final String seatDetails,@Param("busNumber") final Long busNumber);

}
