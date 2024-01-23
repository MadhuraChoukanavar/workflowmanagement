package org.crnts.ticketingservice.service;

import org.crnts.ticketingservice.entity.StatusEntity;

public interface StatusService {

	void save(StatusEntity statusEntity);

	StatusEntity get(String statusCode);
	
	void update(StatusEntity statusEntity);

}
