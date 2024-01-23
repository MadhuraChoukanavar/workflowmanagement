package org.crnts.ticketingservice.controller;

import org.crnts.ticketingservice.entity.IncidentResolvingEntity;
import org.crnts.ticketingservice.entity.PriorityEntity;
import org.crnts.ticketingservice.repository.PriorityRepository;
import org.crnts.ticketingservice.service.PriorityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
@RequestMapping("/priority")
public class PriorityController {
	
	private static Logger log = LoggerFactory.getLogger(PriorityController.class);
	@Autowired
	PriorityRepository priorityRepository;
	@Autowired
	PriorityService priorityService;
	@PostMapping
	public ResponseEntity<PriorityEntity> save(@RequestBody PriorityEntity priorityEntity)
	{
		
		
		log.info("save priority {} ",priorityEntity);
		priorityService.save(priorityEntity);
		ResponseEntity<PriorityEntity> responseEntity = new ResponseEntity<>(priorityEntity,
				HttpStatus.CREATED);
		return responseEntity;
		
	}
	
	@GetMapping(path="/{id}")
	public ResponseEntity<PriorityEntity>  findById(@PathVariable int id)
	{
		PriorityEntity findById = priorityService.findById(id);
		ResponseEntity<PriorityEntity> responseEntity = new ResponseEntity<>(findById,
				HttpStatus.CREATED);
		return responseEntity;
	}

}