package org.crnts.ticketingservice.service;

import org.crnts.ticketingservice.entity.StatusEntity;
//import org.crnts.ticketingservice.exceptions.StatusSaveException;

public interface StatusService {

	void save(StatusEntity statusEntity);

	StatusEntity findById(String statusCode);
	
	void update(StatusEntity statusEntity);

	

}
