package com.spring.apiRest.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.spring.apiRest.dto.PersonalBestDTO;
import com.spring.apiRest.model.PersonalBest;

@Mapper
public interface PersonalBestMapper {
	
	PersonalBestMapper INSTANCE = Mappers.getMapper(PersonalBestMapper.class);

    PersonalBest toModel(PersonalBestDTO personalBestDTO);		//PersonalBestDTO to PersonalBest
    
    PersonalBestDTO toDTO(PersonalBest personalBest);			//PersonalBest to PersonalBestDTO

    
}