package com.spring.apiRest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.apiRest.model.PersonalBest;
import com.spring.apiRest.repository.PersonalBestRepository;

@Service
public class PersonalBestService {
	
	@Autowired
	PersonalBestRepository repository;	
	
	public List<PersonalBest> findAll() {		
		 return repository.findAll();				 
	}
	
	public PersonalBest findById(Long id) {		
		return repository.findById(id).get();
	}
	
	
	public PersonalBest findByAthlete(Long id) {
		return repository.findByAthlete(id);		
	}
	
	public PersonalBest save(PersonalBest personalBest) {		
		return repository.save(personalBest);
	}
	
	public PersonalBest update(Long id, PersonalBest personalBestDetails) {
		PersonalBest personalBest = repository.findById(id).get();
		
		if(personalBestDetails.getPb1k() != null) {
			personalBest.setPb1k(personalBestDetails.getPb1k());
		}
		if(personalBestDetails.getPb3k() != null) {
			personalBest.setPb3k(personalBestDetails.getPb3k());
		}
		if(personalBestDetails.getPb5k() != null) {
			personalBest.setPb5k(personalBestDetails.getPb5k());
		}
		if(personalBestDetails.getPb10k() != null) {
			personalBest.setPb10k(personalBestDetails.getPb10k());
		}
		if(personalBestDetails.getPb21k() != null) {
			personalBest.setPb21k(personalBestDetails.getPb21k());
		}
		if(personalBestDetails.getPb42k() != null) {
			personalBest.setPb42k(personalBestDetails.getPb42k());
		}
		
		return repository.save(personalBest);		
	}
	
	public String deleteById(Long id) {
		repository.deleteById(id);
		return "Personal best for id=" + id + "deleted";
	}

}
