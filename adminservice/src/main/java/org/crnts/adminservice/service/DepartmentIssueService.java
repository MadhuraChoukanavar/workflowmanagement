package org.crnts.adminservice.service;

import java.util.List;


import org.crnts.adminservice.entity.DepartmentEntity;


import org.crnts.adminservice.entity.DepartmentIssueEntity;
import org.crnts.adminservice.exception.SaveUnqueIssue;

public interface DepartmentIssueService {

void saveIssueType(DepartmentIssueEntity issueEntity );
List<DepartmentIssueEntity> getAll();
void deleteAll();

	void saveIssueType(DepartmentIssueEntity issueEntity) throws SaveUnqueIssue ;

	List<DepartmentIssueEntity> getAll();

	void deleteAll();

	DepartmentIssueEntity findById(long id);
//	DepartmentIssueEntity findByName(String issueName);

}
