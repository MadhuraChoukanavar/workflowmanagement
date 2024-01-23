package org.crnts.adminservice.repository;

import org.crnts.adminservice.entity.DepartmentIssueEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentIssuRepository extends JpaRepository<DepartmentIssueEntity, Long> {

}
