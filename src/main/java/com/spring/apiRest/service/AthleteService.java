package com.spring.apiRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.apiRest.model.Athlete;
import com.spring.apiRest.repository.AthleteRepository;
import com.spring.apiRest.service.exceptions.EntityNotFoundException;


@Service
public class AthleteService {
	
	@Autowired
	private AthleteRepository repository;	
	
	public Athlete findById(Long id) {
		 Athlete entity = repository.findById(id).orElseThrow(
				 	() -> new EntityNotFoundException("ID not found " + id));		 					
		 return entity;
	}
	

	public List<Athlete> findAll() {		
		 return repository.findAll();				 
	}
	
	public List<Athlete> findByNameContains(String name){
		return repository.findByNameContainsIgnoreCase(name);				
	}
	
	public Athlete save(Athlete athlete) {
		return repository.save(athlete);  
	}
	
	public Athlete deleteById(Long id) {
		Athlete entity = findById(id);
		repository.deleteById(id);
		return entity;		
	}
	
	public Athlete update(Long id, Athlete athleteDetails) {
		Athlete athlete = repository.findById(id).get();
		
		if(athleteDetails.getName() != null) {
			athlete.setName(athleteDetails.getName());
		}
		if(athleteDetails.getSurname() != null) {
			athlete.setSurname(athleteDetails.getSurname());
		}
		if(athleteDetails.getBirthDate() != null) {
			athlete.setBirthDate(athleteDetails.getBirthDate());
		}
		if(athleteDetails.getHeight() != null) {
			athlete.setHeight(athleteDetails.getHeight());
		}
		if(athleteDetails.getWeight() != null) {
			athlete.setWeight(athleteDetails.getWeight());
		}
			
		return repository.save(athlete);
		
		 
		
	}
	
	

}
