package org.endpoint.theone.myendpoint.exception;

public class DataFormatErrorException extends RuntimeException {
	private static final long serialVersionUID = -5183401106920230420L;
	public DataFormatErrorException(String message) {
		super(message);
	}

}
