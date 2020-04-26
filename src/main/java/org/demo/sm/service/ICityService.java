package org.demo.sm.service;

import java.util.List;

import org.demo.sm.model.City;


public interface ICityService {
	
	List<City> findAll();
    City findById(Long id);
    
}
