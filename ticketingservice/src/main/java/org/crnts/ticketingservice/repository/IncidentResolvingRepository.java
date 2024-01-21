package org.crnts.ticketingservice.repository;

import org.crnts.ticketingservice.entity.IncidentResolvingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidentResolvingRepository extends JpaRepository<IncidentResolvingEntity, Long> {

}