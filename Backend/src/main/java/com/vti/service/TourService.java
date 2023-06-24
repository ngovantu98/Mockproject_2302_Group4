package com.vti.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.vti.dto.TourFormForCreating;
import com.vti.dto.TourFormForUpdating;
import com.vti.dto.filter.TourFilter;
import com.vti.entity.Tour;

import com.vti.repository.TourRepository;
import com.vti.specification.TourSpecificationBuilder;

@Service
public class TourService implements ITourService {

	@Autowired
	private TourRepository repository;

	public Page<Tour> getAllTours(Pageable pageable, TourFilter filter, String search) {

		TourSpecificationBuilder specification = new TourSpecificationBuilder(filter, search);
		return repository.findAll(specification.build(), pageable);
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
		entity.setName(form.getName());
		entity.setDeparturePlace(form.getDeparturePlace());
		entity.setEmptySeat(form.getEmptySeat());
		entity.setDescribe(form.getDescribe());
		entity.setDepartureDay(form.getDepartureDay());
		repository.save(entity);
	}

	@Transactional
	public void deleteTours(List<Short> ids) {
		repository.deleteByIdIn(ids);	
	}

}
