package com.stg.customerexception;

public class CustomerException extends Exception{
	
	private String errorMessage;

	public CustomerException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	@Override
	public String getMessage() {
		return this.errorMessage;
	}
	
	

}
