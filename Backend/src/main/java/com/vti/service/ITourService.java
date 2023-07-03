package com.vti.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.vti.dto.GroupFormForCreating;
import com.vti.dto.GroupFormForUpdating;
import com.vti.dto.TourFormForCreating;
import com.vti.dto.TourFormForUpdating;
import com.vti.dto.filter.GroupFilter;
import com.vti.dto.filter.TourFilter;
import com.vti.entity.Group;
import com.vti.entity.Tour;
import com.vti.entity.Trip;

public interface ITourService {

	List<Tour> getAllTours();

	List<Tour> getTourByName(String name);

	void createTour(TourFormForCreating form);

	Tour getTourByID(short id);

	void updateTour(short id, TourFormForUpdating form);

	void deleteTours(List<Short> ids);

}
