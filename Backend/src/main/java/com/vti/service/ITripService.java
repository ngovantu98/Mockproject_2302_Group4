package com.vti.service;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.vti.dto.TripFormForCreating;
import com.vti.dto.TripFormForUpdating;
import com.vti.dto.filter.TripFilter;
import com.vti.entity.Trip;

public interface ITripService {

	Page<Trip> getAllTrips(Pageable pageable, TripFilter filter, String search);

	List<Trip> getTripByName(String name);

	void createTrip(TripFormForCreating form);

	Trip getTripByID(short id);

	void updateTrip(short id, TripFormForUpdating form);

	void deleteTrips(List<Short> ids);

}
