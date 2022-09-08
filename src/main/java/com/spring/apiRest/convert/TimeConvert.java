package com.spring.apiRest.convert;

public class TimeConvert {
	
	public Integer convertTimetoSecond(String time) {
		String[] timeToConvert = time.split(":");
		int hour = Integer.parseInt(timeToConvert[0]);
		int minute = Integer.parseInt(timeToConvert[1]);
		int second = Integer.parseInt(timeToConvert[2]);
		
		return second + (minute*60) + (hour*3600);		
		
	}

}
