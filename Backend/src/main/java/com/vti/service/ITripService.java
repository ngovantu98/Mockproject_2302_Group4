package com.vti.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.vti.dto.GroupFormForCreating;
import com.vti.dto.GroupFormForUpdating;
import com.vti.dto.TripFormForCreating;
import com.vti.dto.TripFormForUpdating;
import com.vti.dto.filter.GroupFilter;
import com.vti.entity.Group;
import com.vti.entity.Trip;

public interface ITripService {

//	Page<Trip> getAllTrips(Pageable pageable, TripFilter filter, String search);
//
//	boolean isTripExistsByName(String name);

	void createTrip(TripFormForCreating form);

//	Group getTripByID(short id);

	void updateTrip(short id, TripFormForUpdating form);

	void deleteTrips(List<Short> ids);

}
