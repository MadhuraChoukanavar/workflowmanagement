package org.crnts.ticketingservice.controller;

import org.crnts.ticketingservice.entity.IncidentResolvingEntity;
import org.crnts.ticketingservice.repository.IncidentResolvingRepository;
import org.crnts.ticketingservice.service.IncidentResolvingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
@RequestMapping("/ticketing")
public class IncidentResolvingController {
	
	private static Logger log = LoggerFactory.getLogger(IncidentResolvingController.class);
		@Autowired
	IncidentResolvingService incidentResolvingService;
		@Autowired
	IncidentResolvingRepository incidentResolvingRepository;
	
		@Autowired
		private RestTemplate restTemplate;
	

	@PostMapping
	public ResponseEntity<IncidentResolvingEntity> save(@RequestBody IncidentResolvingEntity incidentResolving) {
		log.info("Saving incidentresolving {}", incidentResolving);
		
			System.out.println("entered controller");
			System.out.println( incidentResolving.toString());
	incidentResolvingService.save(incidentResolving);

		ResponseEntity<IncidentResolvingEntity> responseEntity = new ResponseEntity<>(incidentResolving,
				HttpStatus.CREATED);
		
		System.out.println("hii i am saving");
		return responseEntity;
	}
	
	@PostMapping(path="/updatepriority/{newpriority}/{incidentId}")
	
	public ResponseEntity<Object> updatePriorty(@PathVariable int newpriority,@PathVariable long incidentId)
	{
		try
		{
			System.out.println(incidentId);
			
		incidentResolvingService.updatePriority(newpriority, incidentId);
	
		System.out.println(incidentId);
		return new ResponseEntity<>(HttpStatus.OK);
	
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	

}
