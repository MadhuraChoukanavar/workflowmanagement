package org.crnts.ticketingservice.service;

import org.crnts.ticketingservice.bean.DepartmentBean;
import org.crnts.ticketingservice.bean.TicketRaiserBean;
import org.crnts.ticketingservice.entity.TicketRaiserEntity;


public interface TicketRaiserService {

	void save(TicketRaiserEntity ticketRaiserEntity);
	
	

	public DepartmentBean getDepartmentBean(long id);
	TicketRaiserEntity save(TicketRaiserBean ticketRaiserBean);
}
