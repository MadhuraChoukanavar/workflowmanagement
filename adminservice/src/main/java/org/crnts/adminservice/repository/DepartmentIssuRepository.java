package org.crnts.adminservice.repository;

import org.crnts.adminservice.entity.DepartmentIssueEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DepartmentIssuRepository extends JpaRepository<DepartmentIssueEntity, Long> {
//	
//@Query(value = "SELECT * From department_issue_types Where issue_type_name=issueName"
//		, nativeQuery = true)
//	@Param(value="issueName")
DepartmentIssueEntity findByIssueName( String issueName);

}
