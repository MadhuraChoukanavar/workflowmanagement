package org.crnts.ticketingservice.exceptionhandler;

import org.crnts.ticketingservice.exception.StatusAlreadyExistException;
//import org.crnts.ticketingservice.exceptions.StatusSaveException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StatusSaveExceptionHandler {
	
	@ExceptionHandler(value = StatusAlreadyExistException.class)
	public ResponseEntity<String> exception(StatusAlreadyExistException exception) {
		//log.error("ResourceNotFoundException-" + exception.getMessage(), exception);
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	
	

}
