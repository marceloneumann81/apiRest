package com.spring.apiRest.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class AthleteCreateDTO {
		
	private String name;
	
	private String surname;	

	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate birthDate;
	
	private Float height;
	
	private Float weight;	
	

}
