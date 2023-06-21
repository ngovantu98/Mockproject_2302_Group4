package com.vti.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.vti.entity.Group;
import com.vti.entity.Trip;

public interface TripRepository extends JpaRepository<Trip, Short>, JpaSpecificationExecutor<Trip> {

	public Trip findByName(String name);

	public boolean existsByName(String name);

	public void deleteByIdIn(List<Short> ids);
}
