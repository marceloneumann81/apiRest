package com.spring.apiRest.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString
public class Race {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private Long idAthlete;
	
	@PastOrPresent(message = "Date need to be present or past")
	private LocalDate raceDate;
	
	@JsonFormat(pattern = "HH:mm:ss")
	private String raceTime;
	
	@NotBlank(message = "Name not to be blank")
	private String description;
	
	
	private RaceDistance distance;
	
	
	private RaceType type;
	
	

}
