package com.vti.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.vti.entity.Trip;

public interface TripRepository extends JpaRepository<Trip, Short>, JpaSpecificationExecutor<Trip> {
	

	List<Trip> findByName(String name);
	
	List<Trip> findByTourId(short id);

	//public boolean existsByName(String name);

	public void deleteByIdIn(List<Short> ids);

}