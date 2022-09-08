package com.spring.apiRest.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="athlete")
@Getter @Setter @ToString
public class Athlete {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;	
	
	@NotBlank(message = "Name not to be blank")
	private String name;
	
	private String surname;	

	@PastOrPresent(message = "Date need to be present or past")	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate birthDate;
	
	@Min(value = 0, message = "Height must be greater than 0")
	private Float height;
	
	@Min(value = 0, message = "Weight must be greater than 0")
	private Float weight;	
	
	
}
