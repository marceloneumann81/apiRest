package com.spring.apiRest.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(Include.NON_NULL)
@Getter @Setter @ToString 
public class AthleteDTO {
	
	private Long id;
	
	private String name;
	
	private String surname;	

	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate birthDate;
	
	private Float height;
	
	private Float weight;	
	

}
