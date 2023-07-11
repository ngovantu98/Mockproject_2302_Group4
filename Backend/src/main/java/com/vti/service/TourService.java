package com.vti.service;


import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vti.dto.TourDTO;
import com.vti.dto.TourFormForCreating;
import com.vti.dto.TourFormForUpdating;
import com.vti.entity.Tour;
import com.vti.entity.Trip;
import com.vti.repository.TourRepository;
import com.vti.repository.TripRepository;

@Service
public class TourService implements ITourService {

	@Autowired
	private TourRepository tourRepository;
	
	@Autowired
	private TripRepository tripRepository;
	
	private ModelMapper mapper = new ModelMapper();

	public List<TourDTO> getAllTours() {//tạo getAllTours
		List<Tour> tours = tourRepository.findAll();//Lấy ra tất cả các tour
		
		List<TourDTO> tourDTOs = new ArrayList<>();//tẠO LIST CHỨA TourDTO
//		mapper.map(tours,tourDTOs);
		for(Tour tour : tours) {
			TourDTO tourDTO = mapper.map(tour, TourDTO.class);
			List<Trip> trips = tripRepository.findByTourId(tour.getId());//Lấy trip theo id Tour
			tourDTO.setListTrip(trips);//Lấy ra danh sách Trip
			tourDTOs.add(tourDTO);//thêm dữ liệu cho mảng
		}
		return tourDTOs;
	}

	public List<Tour> getTourByName(String name) {
		return tourRepository.findByName(name);
	}

	public void createTour(TourFormForCreating form) {
		tourRepository.save(form.toEntity());
	}
	
	public TourDTO getTourByID(short id) {//tạo getTourByID
		Tour tour = tourRepository.findById(id).get();//Lấy tour by id
		
			TourDTO tourDTO = mapper.map(tour, TourDTO.class);
			List<Trip> trips = tripRepository.findByTourId(tour.getId());//Lấy trip theo id Tour
			tourDTO.setListTrip(trips);//Lấy ra danh sách Trip
		
		return tourDTO;
	}

	public void updateTour(short id, TourFormForUpdating form) {
		Tour entity = tourRepository.findById(id).get();
		entity.setPrice1(form.getPrice1());
		entity.setName(form.getName());
		entity.setDeparturePlace(form.getDeparturePlace());
		entity.setDepartureDay(form.getDepartureDay());
		entity.setEmptySeat(form.getEmptySeat());
		entity.setTime(form.getTime());
		entity.setDescribe(form.getDescribe());
		entity.setTourImage1(form.getTourImage1());
		entity.setTourImage2(form.getTourImage2());
		entity.setTourImage3(form.getTourImage3());
		entity.setTourImage4(form.getTourImage4());
		entity.setTourImage5(form.getTourImage5());
		entity.setPrice2(form.getPrice2());
		entity.setTourManage(form.getTourManage());
		entity.setHighLight(form.getHighLight());
		tourRepository.save(entity);
		
	}

	@Transactional
	public void deleteTours(List<Short> ids) {
		tourRepository.deleteByIdIn(ids);	
	}
}
