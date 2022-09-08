package com.spring.apiRest.exception;

import java.time.Instant;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @NoArgsConstructor
public class StandardError {
	
	private Instant timestamp;
	private Integer status;
	private String error;
	private String message;
	private String path;

}
