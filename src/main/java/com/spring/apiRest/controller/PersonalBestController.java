package com.spring.apiRest.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.apiRest.dto.PersonalBestDTO;
import com.spring.apiRest.mapper.PersonalBestMapper;
import com.spring.apiRest.model.PersonalBest;
import com.spring.apiRest.service.PersonalBestService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1/personalbest")
public class PersonalBestController {
	
	@Autowired
	private PersonalBestService service;
	
	PersonalBestMapper personalBestMapper = PersonalBestMapper.INSTANCE;
	
	@GetMapping
	@ApiOperation("Find all PersonalBest")
	public List<PersonalBestDTO> findAll(){
		List<PersonalBest> personalBest = service.findAll();		
		return personalBest
				.stream()
				.map(personalBestMapper::toDTO)
				.collect(Collectors.toList());					
	}
	
	@GetMapping("/athlete/{id}")
	@ApiOperation("Find by Athlete ID")
	public PersonalBestDTO findByAthlete(@PathVariable Long id) {
		return personalBestMapper.toDTO(service.findByAthlete(id));
	}
	
	@PostMapping
	@ApiOperation("Create")
	public PersonalBestDTO createPersonalBest(@RequestBody PersonalBestDTO personalBestDetails) {
		PersonalBest personalBest = personalBestMapper.toModel(personalBestDetails);		
		return personalBestMapper.toDTO(service.save(personalBest));
	}
	
	@PutMapping("/athlete/{id}")
	@ApiOperation("Update by Athlete ID")
	public PersonalBestDTO updatePersonalBest(@PathVariable Long id, @RequestBody PersonalBestDTO personalBestDetails) {
		PersonalBest personalBest = personalBestMapper.toModel(personalBestDetails);		
		return personalBestMapper.toDTO(service.update(id, personalBest));
	}
	
	@DeleteMapping("/athlete/{id}")
	@ApiOperation("Delete by Athlete ID")
	public String deleteById(@PathVariable Long id) {
		return service.deleteById(id);
	}

}
