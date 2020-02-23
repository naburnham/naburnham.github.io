package io.naburnham.springbootstarter.exceptions;

@SuppressWarnings("serial")
public class NotFoundException extends RuntimeException {

	public NotFoundException(String id) {
		super(id + " not found");
	}
}
