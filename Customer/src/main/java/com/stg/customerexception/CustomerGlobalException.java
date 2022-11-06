package com.stg.customerexception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerGlobalException {

	@ExceptionHandler(value = CustomerException.class)
	private ResponseEntity<String> errorHandler(Exception exception) {
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.CONFLICT);

	}

}
