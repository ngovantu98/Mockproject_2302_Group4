package com.vti.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.vti.entity.Booking;
import com.vti.entity.Group;

public interface BookingRepository extends JpaRepository<Booking, Short>, JpaSpecificationExecutor<Booking> {

	public Booking findByName(String name);

//	public boolean existsByName(String name);

	public void deleteByIdIn(List<Short> ids);
}
