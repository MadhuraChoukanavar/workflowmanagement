package org.crnts.ticketingservice.controller;

import org.crnts.ticketingservice.entity.StatusEntity;
import org.crnts.ticketingservice.exceptions.StatusSaveException;
import org.crnts.ticketingservice.repository.StatusRepository;
import org.crnts.ticketingservice.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Status")
public class StatusController {

	@Autowired
	private StatusRepository statusRepository;
	
	@Autowired
	private StatusService statusService;
    @PostMapping("/save1")
	public ResponseEntity<StatusEntity> save(@RequestBody StatusEntity statusEntity) {
    	

    	try {
			statusService.save(statusEntity);
		} catch (StatusSaveException e) {
			System.out.println("StatusCode already exists");
			
		}
		ResponseEntity<StatusEntity> responseEntity1 = new ResponseEntity<>(statusEntity, HttpStatus.OK);
		return responseEntity1 ;
	}
    
    @GetMapping(path = "/{statusCode}")
	public ResponseEntity<StatusEntity> get(@PathVariable String statusCode) {

    	StatusEntity statusEntity = statusService.get(statusCode);

		ResponseEntity<StatusEntity> responseEntity = new ResponseEntity<>(statusEntity,
				HttpStatus.OK);
		return responseEntity;
	}
    
    @PutMapping("/update")
    public ResponseEntity<StatusEntity> update(@RequestBody StatusEntity statusEntity) {

    	statusService.update(statusEntity);

        ResponseEntity<StatusEntity> responseEntity = new ResponseEntity<>(statusEntity, HttpStatus.OK);
        return responseEntity;
    }


}
