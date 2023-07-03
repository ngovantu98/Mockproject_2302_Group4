package com.vti.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.vti.dto.TripFormForCreating;
import com.vti.dto.TripFormForUpdating;
import com.vti.dto.filter.TripFilter;
import com.vti.entity.Trip;
import com.vti.repository.TripRepository;
import com.vti.specification.TripSpecificationBuilder;


@Service
public class TripService implements ITripService {

	@Autowired
	private TripRepository repository;

	public Page<Trip> getAllTrips(Pageable pageable, TripFilter filter, String search) {

		TripSpecificationBuilder specification = new TripSpecificationBuilder(filter, search);

		return repository.findAll(specification.build(), pageable);
	}

	public List<Trip> getTripByName(String name) {
		return repository.findByName(name);
	}

	public void createTrip(TripFormForCreating form) {
		repository.save(form.toEntity());
	}

	public Trip getTripByID(short id) {
		return repository.findById(id).get();
	}

	public void updateTrip(short id, TripFormForUpdating form) {
		Trip entity = repository.findById(id).get();
		entity.setName(form.getName());
		entity.setSchedule(form.getSchedule());
		entity.setPointDeparture(form.getPointDeparture());
		entity.setDestination(form.getDestination());
		entity.setHotel(form.getHotel());
		entity.setStartDate(form.getStartDate());
		entity.setEndDate(form.getEndDate());
		entity.setDescribe(form.getDescribe());
		entity.setTripImage1(form.getTripImage1());
		entity.setTripImage2(form.getTripImage2());
		entity.setTripImage3(form.getTripImage3());
		entity.setTripImage4(form.getTripImage4());
		entity.setTripManage(form.getTripManage());
		repository.save(entity);
	}
	
	@Transactional
	public void deleteTrips(List<Short> ids) {
		repository.deleteByIdIn(ids);	
	}
}
