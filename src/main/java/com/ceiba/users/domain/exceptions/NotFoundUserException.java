package com.ceiba.users.domain.exceptions;

public class NotFoundUserException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NotFoundUserException(String message) {
        super(message);
    }
	
}
