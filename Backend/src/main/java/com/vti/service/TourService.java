package com.vti.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.vti.dto.TourFormForCreating;
import com.vti.dto.TourFormForUpdating;
import com.vti.entity.Tour;

import com.vti.repository.TourRepository;

@Service
public class TourService implements ITourService {

	@Autowired
	private TourRepository repository;

	public List<Tour> getAllTours() {
		return repository.findAll();
	}

	public List<Tour> getTourByName(String name) {
		return repository.findByName(name);
	}

	public void createTour(TourFormForCreating form) {
		repository.save(form.toEntity());
	}

	public Tour getTourByID(short id) {
		return repository.findById(id).get();
	}

	public void updateTour(short id, TourFormForUpdating form) {
		Tour entity = repository.findById(id).get();
		entity.setPrice(form.getPrice());
		entity.setName(form.getName());
		entity.setDeparturePlace(form.getDeparturePlace());
		entity.setDepartureDay(form.getDepartureDay());
		entity.setEmptySeat(form.getEmptySeat());
		entity.setTime(form.getTime());
		entity.setDescribe(form.getDescribe());
		entity.setTourImage(form.getTourImage());
		repository.save(entity);
	}

	@Transactional
	public void deleteTours(List<Short> ids) {
		repository.deleteByIdIn(ids);	
	}
}
