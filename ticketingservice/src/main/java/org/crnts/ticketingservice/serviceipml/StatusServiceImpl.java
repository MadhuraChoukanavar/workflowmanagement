package org.crnts.ticketingservice.serviceipml;

import org.crnts.ticketingservice.entity.StatusEntity;
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

}
