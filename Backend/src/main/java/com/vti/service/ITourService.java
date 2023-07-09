package com.vti.service;

import java.util.List;
import com.vti.dto.TourDTO;
import com.vti.dto.TourFormForCreating;
import com.vti.dto.TourFormForUpdating;
import com.vti.entity.Tour;


public interface ITourService {

	List<TourDTO> getAllTours();

	List<Tour> getTourByName(String name);

	void createTour(TourFormForCreating form);

	TourDTO getTourByID(short id);

	void updateTour(short id, TourFormForUpdating form);

	void deleteTours(List<Short> ids);

}
