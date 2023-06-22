package com.vti.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.vti.dto.GroupFormForCreating;
import com.vti.dto.GroupFormForUpdating;
import com.vti.dto.TourFormForCreating;
import com.vti.dto.TourFormForUpdating;
import com.vti.dto.filter.GroupFilter;
import com.vti.entity.Group;

public interface ITourService {

//	Page<Tour> getAllTours(Pageable pageable, TourFilter filter, String search);
//
//	boolean isTourExistsByName(String name);

	void createTour(TourFormForCreating form);

//	Group getTourByID(short id);

	void updateTour(short id, TourFormForUpdating form);

	void deleteTours(List<Short> ids);

}
