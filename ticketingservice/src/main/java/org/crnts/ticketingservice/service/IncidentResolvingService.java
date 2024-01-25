package org.crnts.ticketingservice.service;

import org.crnts.ticketingservice.entity.IncidentResolvingEntity;
import org.springframework.web.bind.annotation.RequestParam;

public interface IncidentResolvingService {
	
	
	IncidentResolvingEntity	save (IncidentResolvingEntity incidentResolvingEntity);
	void updatePriority(int newpriority ,long incidentId);

}
