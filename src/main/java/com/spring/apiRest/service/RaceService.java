package com.spring.apiRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.apiRest.model.Race;
import com.spring.apiRest.repository.RaceRepository;

@Service
public class RaceService {
	
	@Autowired
	private RaceRepository repository;
	
	
	public Race findById(Long id) {
		return repository.findById(id).get(); 
	}

	public List<Race> findAll() {
		return repository.findAll();
					 
	}

	public List<Race> findByAthlete(Long id) {
		return repository.findByAthlete(id);					
	}

	public Race save(Race race) {
		return repository.save(race);
	}
	
	

}
