
 package org.crnts.ticketingservice.serviceimpl;


import java.util.Optional;

import org.crnts.ticketingservice.entity.IncidentResolvingEntity;
import org.crnts.ticketingservice.entity.StatusEntity;
import org.crnts.ticketingservice.exception.StatusAlreadyExistException;
//import org.crnts.ticketingservice.exceptions.StatusSaveException;
import org.crnts.ticketingservice.repository.StatusRepository;
import org.crnts.ticketingservice.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusServiceImpl implements StatusService {
	
	@Autowired
	private StatusRepository statusRepository;

	@Override
	public void save(StatusEntity statusEntity) {
	
		statusRepository.save(statusEntity);

	}
	@Override
	public StatusEntity get(String statusCode) {
		return statusRepository.findById(statusCode).get();
	}

	@Override
	public void update(StatusEntity statusEntity) {
		Optional<StatusEntity>optional=statusRepository.findById(statusEntity.getStatusCode());
		if(optional.isPresent()) {
			
			StatusEntity statusEntity1 = optional.get();
			statusRepository.save(statusEntity);
			System.out.println("update successfull");
		}
		else {
			   throw new StatusAlreadyExistException("Status code already exists");
		}
		
	}

	

}
