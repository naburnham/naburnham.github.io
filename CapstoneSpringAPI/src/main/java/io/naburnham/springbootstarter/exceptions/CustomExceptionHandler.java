package io.naburnham.springbootstarter.exceptions;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {
	
	@ExceptionHandler(value= {ApiRequestException.class})
	public ResponseEntity<Object> handleApiRequestException(ApiRequestException e) {
		
		CustomException apiException = new CustomException(e.getMessage(), HttpStatus.BAD_REQUEST, ZonedDateTime.now(ZoneId.of("Z")));
		
		return new ResponseEntity<Object>(apiException, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = {NotFoundException.class})
	public ResponseEntity<Object> handleNotFoundException(NotFoundException e) {
		CustomException notFoundException = new CustomException(e.getMessage(), HttpStatus.NOT_FOUND, ZonedDateTime.now(ZoneId.of("Z")));
		
		return new ResponseEntity<Object>(notFoundException, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value= {DatabaseRequestException.class})
	public ResponseEntity<Object> handleDatabaseRequestException(DatabaseRequestException e) {
		CustomException databaseException = new CustomException(e.getMessage(), HttpStatus.BAD_GATEWAY, ZonedDateTime.now(ZoneId.of("Z")));
		
		return new ResponseEntity<Object>(databaseException, HttpStatus.BAD_GATEWAY);
	}
}
