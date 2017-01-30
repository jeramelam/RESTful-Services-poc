package org.endpoint.theone.myendpoint.exception;

public class DatabaseErrorException extends RuntimeException {
	private static final long serialVersionUID = 9146737978489336481L;
	public DatabaseErrorException(String message) {
		super(message);
	}	
}
