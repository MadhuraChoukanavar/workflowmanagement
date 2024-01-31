package org.crnts.ticketingservice.exception;

public class PriorityNotFoundException extends RuntimeException  {
	
	private String message;

	public PriorityNotFoundException(String message) {
		super();
		this.message = message;
	}

	public PriorityNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
