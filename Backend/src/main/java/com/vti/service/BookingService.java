package com.vti.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vti.dto.BookingFormForCreating;
import com.vti.dto.TripFormForCreating;
import com.vti.dto.TripFormForUpdating;
import com.vti.dto.filter.TripFilter;
import com.vti.entity.Trip;
import com.vti.repository.BookingRepository;
import com.vti.repository.TripRepository;
import com.vti.specification.TripSpecificationBuilder;


@Service
public class BookingService implements IBookingService {

	@Autowired
	private BookingRepository repository;

//	public Page<Booking> getAllBookings(Pageable pageable, BookingFilter filter, String search) {
//
//		TripSpecificationBuilder specification = new BookingSpecificationBuilder(filter, search);
//
//		return repository.findAll(specification.build(), pageable);
//	}

//	public List<Booking> getBookingByName(String name) {
//		return repository.findByName(name);
//	}

	public void createBooking(BookingFormForCreating form) {
		repository.save(form.toEntity());
	}

//	public Trip getTripByID(short id) {
//		return repository.findById(id).get();
//	}

//	public void updateTrip(short id, TripFormForUpdating form) {
//		Trip entity = repository.findById(id).get();
//		entity.setName(form.getName());
//		entity.setSchedule(form.getSchedule());
//		entity.setPointDeparture(form.getPointDeparture());
//		entity.setDestination(form.getDestination());
//		entity.setHotel(form.getHotel());
//		entity.setTotalMember(form.getTotalMember());
//		entity.setStartDate(form.getStartDate());
//		entity.setEndDate(form.getEndDate());
//		entity.setDescribe(form.getDescribe());
//		repository.save(entity);
//	}
	
//	@Transactional
//	public void deleteTrips(List<Short> ids) {
//		repository.deleteByIdIn(ids);	
//	}
}