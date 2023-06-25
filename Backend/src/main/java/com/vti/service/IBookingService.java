package com.vti.service;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.vti.dto.BookingFormForCreating;
import com.vti.dto.TripFormForCreating;
import com.vti.dto.TripFormForUpdating;
import com.vti.dto.filter.TripFilter;
import com.vti.entity.Trip;

public interface IBookingService {

//	Page<Booking> getAllTrips(Pageable pageable, BookingFilter filter, String search);

//	List<Booking> getBookingByName(String name);

	void createBooking(BookingFormForCreating form);

//	Booking getTripByID(short id);
//
//	void updateBooking(short id, BookingFormForUpdating form);
//
//	void deleteBookings(List<Short> ids);

}
