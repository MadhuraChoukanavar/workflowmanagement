package org.crnts.ticketingservice.serviceimpl;

import org.crnts.ticketingservice.entity.IncidentResolvingEntity;
import org.crnts.ticketingservice.repository.IncidentResolvingRepository;
import org.crnts.ticketingservice.service.IncidentResolvingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class IncidentResolvingServiceimpl implements IncidentResolvingService {

	@Autowired
	IncidentResolvingRepository incidentResolvingRepository;

	@Override
	public IncidentResolvingEntity save(IncidentResolvingEntity incidentResolvingEntity) {
		System.out.println("hiiiii service impl");
		System.out.println(incidentResolvingEntity);
		System.out.println(incidentResolvingEntity.toString());
		return incidentResolvingRepository.save(incidentResolvingEntity);

	}

}