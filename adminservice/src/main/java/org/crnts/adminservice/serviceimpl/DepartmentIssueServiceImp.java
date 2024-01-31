package org.crnts.adminservice.serviceimpl;


import java.util.List;

import org.crnts.adminservice.entity.DepartmentEntity;
import org.crnts.adminservice.entity.DepartmentIssueEntity;
import org.crnts.adminservice.exception.SaveUnqueIssue;
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
public void saveIssueType(DepartmentIssueEntity issueEntity) throws SaveUnqueIssue {
	DepartmentIssueServiceImp departmentIssueServiceImp=new DepartmentIssueServiceImp();
	DepartmentIssueEntity issueEntity1  =departmentIssuRepository.findByIssueName(issueEntity.getIssueName());
if(issueEntity1==null) {
	departmentIssuRepository.save(issueEntity);
	System.out.println(" department Issue Type details saved { "+ issueEntity+" }");
}
else {
	throw new SaveUnqueIssue("Issue Name already Exist");
}

}
@Override
public List<DepartmentIssueEntity> getAll() {
	
	return departmentIssuRepository.findAll();
}
@Override
public DepartmentIssueEntity findById(long id) {
	// TODO Auto-generated method stub
	return departmentIssuRepository.findById(id).get();
}

@Override
public void deleteAll() {
	departmentIssuRepository.deleteAll();
	System.out.println("delete all the data");
}
//@Override
//public DepartmentIssueEntity findByName(String issueName) {
//	
//	return departmentIssuRepository.findByName(issueName);
//}




}
