package org.crnts.ticketingservice.serviceimpl;

import org.crnts.ticketingservice.entity.TicketRaiserEntity;
import org.crnts.ticketingservice.repository.TicketRaiserRepository;
import org.crnts.ticketingservice.service.TicketRaiserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class TicketRaiserServiceImpl implements TicketRaiserService{
	
	@Autowired
	private TicketRaiserRepository ticketRaiserRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public void save(TicketRaiserEntity ticketRaiserEntity) {
		
		
		
		ticketRaiserRepository.save(ticketRaiserEntity);
	}

}
