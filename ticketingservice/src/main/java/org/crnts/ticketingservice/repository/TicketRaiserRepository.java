package org.crnts.ticketingservice.repository;

import org.crnts.ticketingservice.entity.TicketRaiserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRaiserRepository extends JpaRepository<TicketRaiserEntity, Long>{

}
