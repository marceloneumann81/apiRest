package com.spring.apiRest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter @ToString @AllArgsConstructor
public enum RaceDistance {
	
	KM3("1"),
	KM5("2"),
	KM10("3"), 
	KM21("4"), 
	KM42("5");
	
	private String distanceCode;

}
