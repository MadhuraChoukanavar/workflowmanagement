package org.crnts.ticketingservice.repository;

import org.crnts.ticketingservice.entity.PriorityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PriorityRepository extends JpaRepository<PriorityEntity, Integer>{
	
	

}
