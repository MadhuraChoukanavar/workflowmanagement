package org.crnts.adminservice.repository;

import org.crnts.adminservice.entity.DepartmentIssueEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DepartmentIssuRepository extends JpaRepository<DepartmentIssueEntity, Long> {

DepartmentIssueEntity findByIssueName( String issueName);

}
