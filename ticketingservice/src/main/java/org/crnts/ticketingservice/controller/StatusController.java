package org.crnts.ticketingservice.controller;

import org.crnts.ticketingservice.entity.StatusEntity;
import org.crnts.ticketingservice.exception.StatusAlreadyExistException;
import org.crnts.ticketingservice.repository.StatusRepository;
import org.crnts.ticketingservice.service.StatusService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
@RequestMapping("/Status")
public class StatusController {

	@Autowired
	private StatusRepository statusRepository;
	private static Logger log = LoggerFactory.getLogger(StatusController.class);
	@Autowired
	private StatusService statusService;
    @PostMapping("/save")
	public ResponseEntity<StatusEntity> save(@RequestBody StatusEntity statusEntity) {
    	log.info("Saving StatusEntity {}", statusEntity);
    	statusService.save(statusEntity);
    	return new ResponseEntity<>(statusEntity,HttpStatus.OK) ;
    	
//    	     try {
//    	    	 statusService.save(statusEntity);
//    	    	 return new ResponseEntity<>(statusEntity,HttpStatus.OK) ;
//    	     }catch(StatusAlreadyExistException e) {
//    	    	 log.info("Saving StatusEntity {}", statusEntity.getStatusCode());
//    	    	 return new ResponseEntity<>(statusEntity,HttpStatus.BAD_REQUEST);
//    	     }
//			
			
	}
    
    @GetMapping(path = "/{statusCode}")
	public ResponseEntity<StatusEntity> get(@PathVariable String statusCode) {

    	StatusEntity statusEntity = statusService.findById(statusCode);

		ResponseEntity<StatusEntity> responseEntity = new ResponseEntity<>(statusEntity,
				HttpStatus.OK);
		return responseEntity;
	}
    
    @PutMapping("/update")
    public ResponseEntity<StatusEntity> update(@RequestBody StatusEntity statusEntity) {
    	log.info("Saving StatusEntity {}", statusEntity);
     
        	statusService.update(statusEntity);
        	ResponseEntity<StatusEntity> responseEntity = new ResponseEntity<>(statusEntity,
    				HttpStatus.OK);
    		return responseEntity;
        	
        	
        }
    	

       
    }



