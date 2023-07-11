package com.vti.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


import com.vti.entity.Tour;

public interface TourRepository extends JpaRepository<Tour, Short>, JpaSpecificationExecutor<Tour> {

	List<Tour> findByName(String name);

//	public boolean existsByName(String name);

	public void deleteByIdIn(List<Short> ids);
	
}
