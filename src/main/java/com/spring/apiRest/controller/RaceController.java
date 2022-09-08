package com.spring.apiRest.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.apiRest.dto.RaceDTO;
import com.spring.apiRest.mapper.RaceMapper;
import com.spring.apiRest.model.Race;
import com.spring.apiRest.service.RaceService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/v1/race")
public class RaceController {
	
	@Autowired
	private RaceService service;
	
	private RaceMapper raceMapper = RaceMapper.INSTANCE;
	
	
	@GetMapping("/{id}")
	@ApiOperation("Find by ID")
	public RaceDTO findById(@PathVariable Long id) {		
		return raceMapper.toDTO(service.findById(id));
	}
	
	@GetMapping
	public List<RaceDTO> findAll() {			
		List<Race> entity = service.findAll();
		return entity
				.stream()
				.map(raceMapper::toDTO)
				.collect(Collectors.toList());		
	}
	
	@GetMapping("/athlete/{id}")
	public List<RaceDTO> findByAthlete(@PathVariable Long id){
		List<Race> entity =  service.findByAthlete(id);
		return entity
				.stream()
				.map(raceMapper::toDTO)
				.collect(Collectors.toList());		
	}
	
	@PostMapping
	public RaceDTO createRace(@RequestBody RaceDTO raceDTO) {		
		Race entity = raceMapper.toModel(raceDTO);		
		return raceMapper.toDTO(service.save(entity));		
	}
	
	
	
	
	

}
