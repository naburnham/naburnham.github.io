package io.naburnham.springbootstarter.exceptions;

@SuppressWarnings("serial")
public class DatabaseRequestException extends RuntimeException {

	public DatabaseRequestException(String message) {
		super(message);
	}
	
	public DatabaseRequestException(String message, Throwable cause) {
		super(message, cause);
	}
}
