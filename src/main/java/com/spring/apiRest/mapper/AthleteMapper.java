package com.spring.apiRest.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.spring.apiRest.dto.AthleteCreateDTO;
import com.spring.apiRest.dto.AthleteDTO;
import com.spring.apiRest.model.Athlete;

@Mapper
public interface AthleteMapper {
	
	AthleteMapper INSTANCE = Mappers.getMapper(AthleteMapper.class);

    Athlete toModel(AthleteDTO athleteDTO);				//AthleteDTO to Athlete
    
    AthleteDTO toDTO(Athlete athlete);					//Athlete to AthleteDTO
    
    
    Athlete toAthleteCreate(AthleteCreateDTO athleteCreateDTO);	//AthleteCreateDTO to Athlete

    
}
