package org.crnts.ticketingservice.repository;

import org.crnts.ticketingservice.entity.CommentsOnIssues;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsOnIssuesRepository extends JpaRepository<CommentsOnIssues, Long>{

}
