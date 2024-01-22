package org.crnts.ticketingservice.repository;


import org.crnts.ticketingservice.entity.StatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<StatusEntity, String>{

	

}
