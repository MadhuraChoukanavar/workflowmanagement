package org.crnts.ticketingservice.controller;

import org.crnts.ticketingservice.entity.TicketRaiserEntity;
import org.crnts.ticketingservice.repository.TicketRaiserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/TicketRaiser")
public class TicketRaiserController {
	
	@Autowired
	private  TicketRaiserRepository ticketRaiserRepository ;
	
    @PostMapping("/save")
	public ResponseEntity<TicketRaiserEntity> save(@RequestBody  TicketRaiserEntity ticketRaiserEntity ) {
		
		ticketRaiserRepository.save(ticketRaiserEntity);

		ResponseEntity<TicketRaiserEntity> responseEntity = new ResponseEntity<>(ticketRaiserEntity,
				HttpStatus.OK);
		return responseEntity;
	}
	
	

}
