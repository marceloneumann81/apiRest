package com.spring.apiRest.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.apiRest.dto.AthleteCreateDTO;
import com.spring.apiRest.dto.AthleteDTO;
import com.spring.apiRest.mapper.AthleteMapper;
import com.spring.apiRest.model.Athlete;
import com.spring.apiRest.service.AthleteService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1/athlete")
public class AthleteController {
	
	@Autowired
	private AthleteService service;
	
	
	private AthleteMapper athleteMapper = AthleteMapper.INSTANCE;
	

	@GetMapping
	@ApiOperation("Find all Athletes")
	public ResponseEntity<List<AthleteDTO>> findAll() {
		List<Athlete> entity = service.findAll();
		List<AthleteDTO> athleteDTO = entity
										.stream()
										.map(athleteMapper::toDTO)
										.collect(Collectors.toList());
		return new ResponseEntity<>(athleteDTO, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	@ApiOperation("Find by ID")
	public ResponseEntity<AthleteDTO> findById(@PathVariable Long id) {		
		Athlete entity = service.findById(id);		
		return new ResponseEntity<>(athleteMapper.toDTO(entity), HttpStatus.OK);			
		
	}
	
	@GetMapping("name/{name}")
	@ApiOperation("Find by NAME")
	public ResponseEntity<List<AthleteDTO>> findByName(@PathVariable String name) {
		List<Athlete> entity = service.findByNameContains(name);
		List<AthleteDTO> athleteDTO = entity
										.stream()
										.map(athleteMapper::toDTO)
										.collect(Collectors.toList());
		return new ResponseEntity<>(athleteDTO, HttpStatus.OK);		
	}
	
	@PostMapping
	@ApiOperation("Create")
	public ResponseEntity<AthleteDTO> createAthlete(@RequestBody @Valid AthleteCreateDTO athleteDetails) {
		Athlete entity = athleteMapper.toAthleteCreate(athleteDetails);
		AthleteDTO athleteDTO = athleteMapper.toDTO(service.save(entity));
		return new ResponseEntity<>(athleteDTO, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	@ApiOperation("Delete")
	public ResponseEntity<AthleteDTO> deleteAthlete(@PathVariable Long id) {
		return new ResponseEntity<>(athleteMapper.toDTO(service.deleteById(id)),HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	@ApiOperation("Update")
	public ResponseEntity<AthleteDTO> updateAthlete(@PathVariable Long id, @RequestBody AthleteCreateDTO athleteDetails) {
		Athlete entity = athleteMapper.toAthleteCreate(athleteDetails);
		return new ResponseEntity<>(athleteMapper.toDTO(service.update(id, entity)),HttpStatus.OK);
		
	}
}
