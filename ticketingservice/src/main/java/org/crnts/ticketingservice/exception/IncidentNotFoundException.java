package org.crnts.ticketingservice.exception;

public class IncidentNotFoundException extends RuntimeException{
	
	public IncidentNotFoundException(String message) {
		super(message);
	}

	public IncidentNotFoundException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
