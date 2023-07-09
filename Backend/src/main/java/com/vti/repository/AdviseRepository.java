package com.vti.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.vti.entity.Advise;
import com.vti.entity.Tour;

public interface AdviseRepository extends JpaRepository<Advise, Short>, JpaSpecificationExecutor<Advise> {

	List<Advise> findByName(String name);

//	public boolean existsByName(String name);

	public void deleteByIdIn(List<Short> ids);
	
}
