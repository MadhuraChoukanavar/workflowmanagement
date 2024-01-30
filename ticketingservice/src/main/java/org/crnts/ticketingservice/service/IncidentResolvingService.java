package org.crnts.ticketingservice.service;

import java.util.List;

import org.crnts.ticketingservice.bean.IncidentResolvingBean;
import org.crnts.ticketingservice.entity.IncidentResolvingEntity;
import org.springframework.web.bind.annotation.RequestParam;

public interface IncidentResolvingService {
	
	
	IncidentResolvingEntity	save (IncidentResolvingBean incidentResolvingBean);
	void updatePriority(int newpriority ,long incidentId);
	
	//id update(IncidentResolvingEntity incidentResolvingEntity,long id);
	//void updatePriority(int newpriority, String statusCode);
	//void updateStatusCode(int newpriority, long incidentId);
	//void updateStatusCode(String statusCode, long resolvingId);
	IncidentResolvingBean update(IncidentResolvingBean incidentResolvingBean);
	
	
	   List<IncidentResolvingBean> getAllOpenEntity();
	   
	   
}
