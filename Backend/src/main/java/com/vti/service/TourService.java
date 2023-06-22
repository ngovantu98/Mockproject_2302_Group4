package com.vti.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vti.dto.GroupFormForCreating;
import com.vti.dto.GroupFormForUpdating;
import com.vti.dto.TourFormForCreating;
import com.vti.dto.TourFormForUpdating;
import com.vti.dto.filter.GroupFilter;
import com.vti.entity.Group;
import com.vti.entity.Tour;
import com.vti.repository.GroupRepository;
import com.vti.repository.TourRepository;
import com.vti.specification.GroupSpecificationBuilder;

@Service
public class TourService implements ITourService {

	@Autowired
	private TourRepository repository;

//	public Page<Group> getAllGroups(Pageable pageable, GroupFilter filter, String search) {
//
//		GroupSpecificationBuilder specification = new GroupSpecificationBuilder(filter, search);
//
//		return repository.findAll(specification.build(), pageable);
//	}
//
//	public boolean isGroupExistsByName(String name) {
//		return repository.existsByName(name);
//	}

	public void createTour(TourFormForCreating form) {
		repository.save(form.toEntity());
	}

//	public Group getGroupByID(short id) {
//		return repository.findById(id).get();
//	}

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
