package com.spring.apiRest.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "personalbest")
@Table(name="personalbest")
@Getter @Setter @ToString
public class PersonalBest {
	
	@Id		
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	
	@Column(unique = true)
	private Long idAthlete;
	private String pb1k;
	private String pb3k;
	private String pb5k;
	private String pb10k;
	private String pb21k;
	private String pb42k;	
	
	
	
	
}
