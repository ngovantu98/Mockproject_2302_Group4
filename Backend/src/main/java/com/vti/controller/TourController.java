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

import com.vti.dto.TourFormForCreating;
import com.vti.dto.TourFormForUpdating;
import com.vti.dto.filter.TourFilter;
import com.vti.entity.Tour;
import com.vti.service.ITourService;

@RestController
@RequestMapping(value = "api/v1/tours")
public class TourController {

	@Autowired
	private ITourService service;

	@GetMapping()
	public ResponseEntity<?> getAllTours() {
		List<Tour> entities = service.getAllTours();
		return new ResponseEntity<>(entities, HttpStatus.OK);
	}

	@GetMapping("/name")
	public ResponseEntity<?> getTourByName(@RequestParam String name) {
		return new ResponseEntity<>(service.getTourByName(name), HttpStatus.OK);
	}

	@PostMapping()
	public ResponseEntity<?> createTour(@RequestBody TourFormForCreating form) {
		service.createTour(form);
		return new ResponseEntity<String>("Create successfully!", HttpStatus.OK);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<?> getTourByID(@PathVariable(name = "id") short id) {
		return new ResponseEntity<>(service.getTourByID(id), HttpStatus.OK);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<?> updateTour(@PathVariable(name = "id") short id, @RequestBody TourFormForUpdating form) {
		service.updateTour(id, form);
		return new ResponseEntity<String>("Update successfully!", HttpStatus.OK);
	}
	

	@DeleteMapping(value = "/{ids}")
	public ResponseEntity<?> deleteTours(@PathVariable(name = "ids") List<Short> ids) {
		service.deleteTours(ids);
		return new ResponseEntity<String>("Delete successfully!", HttpStatus.OK);
	}
}
