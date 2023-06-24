package com.vti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vti.dto.GroupFormForCreating;
import com.vti.dto.GroupFormForUpdating;
import com.vti.dto.TripFormForCreating;
import com.vti.dto.TripFormForUpdating;
import com.vti.dto.filter.GroupFilter;
import com.vti.dto.filter.TripFilter;
import com.vti.entity.Group;
import com.vti.entity.Trip;
import com.vti.service.IGroupService;
import com.vti.service.ITripService;

@RestController
@RequestMapping(value = "api/v1/trips")
public class TripController {

	@Autowired
	private ITripService service;
	@GetMapping()
	public ResponseEntity<?> getAllTrips(
			Pageable pageable, 
			TripFilter filter,
			@RequestParam(required = false) 
			String search) {
		Page<Trip> entities = service.getAllTrips(pageable, filter, search);
		return new ResponseEntity<>(entities, HttpStatus.OK);
	}

	@GetMapping("/name")
	public ResponseEntity<?> getTripByName(@RequestParam String name) {
		return new ResponseEntity<>(service.getTripByName(name), HttpStatus.OK);
	}

	@PostMapping()
	public ResponseEntity<?> createTrip(@RequestBody TripFormForCreating form) {
		service.createTrip(form);
		return new ResponseEntity<String>("Create successfully!", HttpStatus.OK);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<?> getTripByID(@PathVariable(name = "id") short id) {
		return new ResponseEntity<>(service.getTripByID(id), HttpStatus.OK);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<?> updateTrip(@PathVariable(name = "id") short id, @RequestBody TripFormForUpdating form) {
		service.updateTrip(id, form);
		return new ResponseEntity<String>("Update successfully!", HttpStatus.OK);
	}

	@DeleteMapping(value = "/{ids}")
	public ResponseEntity<?> deleteTrips(@PathVariable(name = "ids") List<Short> ids) {
		service.deleteTrips(ids);
		return new ResponseEntity<String>("Delete successfully!", HttpStatus.OK);
	}
}
