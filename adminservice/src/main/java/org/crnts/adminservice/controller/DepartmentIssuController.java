package org.crnts.adminservice.controller;

import java.util.List;

import org.crnts.adminservice.entity.DepartmentEntity;
import org.crnts.adminservice.entity.DepartmentIssueEntity;
import org.crnts.adminservice.service.DepartmentIssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/IssueType")
public class DepartmentIssuController {
@Autowired
private DepartmentIssueService issueService;

@PostMapping("/save")
public ResponseEntity<DepartmentIssueEntity> save(@RequestBody DepartmentIssueEntity departmentIssueEntity) {
	log.info("Saving department {}", departmentIssueEntity);
		issueService.saveIssueType(departmentIssueEntity);
		System.out.println(departmentIssueEntity);
	ResponseEntity<DepartmentIssueEntity> responseEntity = new ResponseEntity<>(departmentIssueEntity,
			HttpStatus.CREATED);
	System.out.println("Data inserted");
	return responseEntity;
}
@GetMapping("/getAll")
public ResponseEntity<List<DepartmentIssueEntity>>getAll(){
	List<DepartmentIssueEntity> departmentIssueEntity= issueService.getAll();
	log.info("Fetching department_details {}", departmentIssueEntity);
	System.out.println("Fetching department_details { "+departmentIssueEntity+" }");
	ResponseEntity<List<DepartmentIssueEntity>> responseEntity = new ResponseEntity<List<DepartmentIssueEntity>>(departmentIssueEntity,
			HttpStatus.OK);
	return responseEntity;

}

}
