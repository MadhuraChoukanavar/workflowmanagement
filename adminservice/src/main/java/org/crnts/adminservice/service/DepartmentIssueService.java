package org.crnts.adminservice.service;

import java.util.List;

import org.crnts.adminservice.entity.DepartmentEntity;
import org.crnts.adminservice.entity.DepartmentIssueEntity;

public interface DepartmentIssueService {
void saveIssueType(DepartmentIssueEntity issueEntity );
List<DepartmentIssueEntity> getAll();
void deleteAll();
}
