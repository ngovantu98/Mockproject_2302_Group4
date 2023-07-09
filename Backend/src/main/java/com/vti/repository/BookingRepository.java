package com.vti.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.vti.entity.Booking;



public interface BookingRepository extends JpaRepository<Booking, Short>, JpaSpecificationExecutor<Booking> {

	List<Booking> findByName(String name);
	List<Booking> findByTourId(short id);

//	public boolean existsByName(String name);

	public void deleteByIdIn(List<Short> ids);
}
