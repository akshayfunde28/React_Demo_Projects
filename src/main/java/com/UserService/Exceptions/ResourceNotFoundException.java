package com.UserService.Exceptions;

public class ResourceNotFoundException  extends RuntimeException{
	
	
	public ResourceNotFoundException() {
		// TODO Auto-generated constructor stub
		super("Resources not found Exceptions !!! ");
	}
	public ResourceNotFoundException(String msg ) {
		super(msg);
	}

}
