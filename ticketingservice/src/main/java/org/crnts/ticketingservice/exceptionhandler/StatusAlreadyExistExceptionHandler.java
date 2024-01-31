package org.crnts.ticketingservice.exceptionhandler;

import org.crnts.ticketingservice.controller.StatusController;
import org.crnts.ticketingservice.exception.StatusAlreadyExistException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@ControllerAdvice
public class StatusAlreadyExistExceptionHandler {
	private static Logger log = LoggerFactory.getLogger(StatusAlreadyExistExceptionHandler.class);
	@ExceptionHandler(value = StatusAlreadyExistException.class)
	public ResponseEntity<String> exception(StatusAlreadyExistException exception) {
		log.error("ResourceNotFoundException-" + exception.getMessage(), exception);
		return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	
	

}
