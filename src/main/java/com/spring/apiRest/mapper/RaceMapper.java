package com.spring.apiRest.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.spring.apiRest.dto.RaceDTO;
import com.spring.apiRest.model.Race;

@Mapper
public interface RaceMapper {
	
	RaceMapper INSTANCE = Mappers.getMapper(RaceMapper.class);
	
	Race toModel(RaceDTO raceDTO);
	
	RaceDTO toDTO(Race race);

}
