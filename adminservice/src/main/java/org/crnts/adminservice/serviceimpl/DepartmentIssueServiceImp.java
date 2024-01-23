package org.crnts.adminservice.serviceimpl;


import java.util.List;

import org.crnts.adminservice.entity.DepartmentIssueEntity;
import org.crnts.adminservice.repository.DepartmentIssuRepository;
import org.crnts.adminservice.service.DepartmentIssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class DepartmentIssueServiceImp implements DepartmentIssueService{
@Autowired
private DepartmentIssuRepository departmentIssuRepository;

@Override
public void saveIssueType(DepartmentIssueEntity issueEntity) {
	departmentIssuRepository.save(issueEntity);
	System.out.println(" department Issue Type details saved { "+ issueEntity+" }");
}

@Override
public List<DepartmentIssueEntity> getAll() {
	
	return departmentIssuRepository.findAll();
}

@Override
public void deleteAll() {
	departmentIssuRepository.deleteAll();
	System.out.println("delete all the data");
}


}
