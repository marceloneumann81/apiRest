package com.spring.apiRest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(Include.NON_NULL)
@Getter @Setter @ToString
public class PersonalBestDTO {
	
	private Long id;	
	private Long idAthlete;
	private String pb1k;
	private String pb3k;
	private String pb5k;
	private String pb10k;
	private String pb21k;
	private String pb42k;	
	
	
	
	
	

}
