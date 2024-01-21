package org.crnts.ticketingservice.controller;

import org.crnts.ticketingservice.entity.StatusEntity;
import org.crnts.ticketingservice.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Status")
public class StatusController {

	@Autowired
	private StatusRepository statusRepository;
    @PostMapping("/save1")
	public ResponseEntity<StatusEntity> save(@RequestBody StatusEntity statusEntity) {

		statusRepository.save(statusEntity);
		ResponseEntity<StatusEntity> responseEntity1 = new ResponseEntity<>(statusEntity, HttpStatus.OK);
		return responseEntity1 ;
	}

}
