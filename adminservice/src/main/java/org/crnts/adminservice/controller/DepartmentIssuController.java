package org.crnts.adminservice.controller;

import java.util.List;

import org.crnts.adminservice.bean.DepartmentIssueBean;
import org.crnts.adminservice.entity.DepartmentIssueEntity;
import org.crnts.adminservice.exception.SaveUnqueIssue;
import org.crnts.adminservice.repository.DepartmentIssuRepository;
import org.crnts.adminservice.service.DepartmentIssueService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/IssueType")
public class DepartmentIssuController {
	private static Logger log = LoggerFactory.getLogger(DepartmentIssuController.class);
	@Autowired
	private DepartmentIssueService issueService;
	@Autowired
	private DepartmentIssuRepository departmentIssuRepository;

	@PostMapping("/save")
	public ResponseEntity<DepartmentIssueEntity> save(@RequestBody DepartmentIssueBean departmentIssueBean) {
	log.info("Saving patient {}", departmentIssueBean);
	DepartmentIssueEntity departmentIssueEntity=new DepartmentIssueEntity();
	departmentIssueEntity.setIssueId(departmentIssueBean.getIssueId());
	departmentIssueEntity.setIssueName(departmentIssueBean.getIssueName());
	departmentIssueEntity.setDepartmentId(departmentIssueBean.getDepartmentId());
try {
		issueService.saveIssueType(departmentIssueEntity);
		ResponseEntity<DepartmentIssueEntity> responseEntity = new ResponseEntity<>(departmentIssueEntity,
				HttpStatus.CREATED);
		System.out.println("Data inserted");
		return responseEntity;
	}
catch (Exception e) {
   
   System.out.println(e.getMessage());
   return new  ResponseEntity<>(HttpStatus.NOT_FOUND);
}
	}



	@GetMapping("/getAll")
	public ResponseEntity<List<DepartmentIssueEntity>> getAll() {
		List<DepartmentIssueEntity> departmentIssueEntities = issueService.getAll();
	log.info("Fetching department_details {}", departmentIssueEntities);
		System.out.println("Fetching department_details { " + departmentIssueEntities + " }");
		ResponseEntity<List<DepartmentIssueEntity>> responseEntity = new ResponseEntity<List<DepartmentIssueEntity>>(
				departmentIssueEntities, HttpStatus.OK);
		return responseEntity;

	}

	@GetMapping("/getById/{id}")
	public ResponseEntity<DepartmentIssueEntity> getById(@PathVariable Long id) {
	log.info("Fetching DepartmentIssueEntity {}", id);
//		System.out.println("Fetching departmentIssue {" + id + "}");
		DepartmentIssueEntity departmentIssueEntity = issueService.findById(id);

		ResponseEntity<DepartmentIssueEntity> responseEntity = new ResponseEntity<>(departmentIssueEntity,
				HttpStatus.OK);
		return responseEntity;
	}

	@DeleteMapping("/deleteAll")
	public ResponseEntity<DepartmentIssueEntity> deleteAll(DepartmentIssueEntity departmentIssueEntity) {
	log.info("Fetching DepartmentIssueEntity {}", departmentIssueEntity);
		issueService.deleteAll();

		ResponseEntity<DepartmentIssueEntity> responseEntity = new ResponseEntity<>(departmentIssueEntity,
				HttpStatus.OK);
		return responseEntity;
	}
}
