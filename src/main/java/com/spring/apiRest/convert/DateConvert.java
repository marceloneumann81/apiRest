package com.spring.apiRest.convert;

import java.time.LocalDate;

public class DateConvert {
	
	private final String PATTERN_DATE = "dd/MM/yyyy";
	private final String PATTERN_TIME = "HH:mm:ss"; 
	
	public LocalDate toDate(String date) {
		return LocalDate.parse(date);
	}

}
