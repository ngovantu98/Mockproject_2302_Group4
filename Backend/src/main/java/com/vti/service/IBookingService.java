package com.vti.service;

import com.vti.dto.BookingFormForCreating;

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
