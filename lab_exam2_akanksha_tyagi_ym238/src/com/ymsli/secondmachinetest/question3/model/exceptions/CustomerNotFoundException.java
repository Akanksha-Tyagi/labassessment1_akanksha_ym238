package com.ymsli.secondmachinetest.question3.model.exceptions;

public class CustomerNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = -1908453897294649033L;

	public CustomerNotFoundException(String message) {
		super(message);
	}

}
