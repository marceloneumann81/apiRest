package com.spring.apiRest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter @ToString @AllArgsConstructor
public enum RaceType {
	
	COMMON("1"), TEST("2"), RACE("3");
	
	private String raceCode;
	

}
