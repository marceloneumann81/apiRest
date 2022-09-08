package com.spring.apiRest.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.spring.apiRest.model.RaceDistance;
import com.spring.apiRest.model.RaceType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class RaceDTO {

	private Long id;
	private Long idAthlete;
	private RaceDistance distance;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate raceDate;
	
	private String raceTime;
	private String description;
	private RaceType type;
	
	
	
}
