package org.crnts.adminservice.controller;

import org.crnts.adminservice.bean.EmployeeBean;
import org.crnts.adminservice.entity.EmployeeEntity;
import org.crnts.adminservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/saveEmployee")
	public ResponseEntity<EmployeeEntity> saveEmployee(@RequestBody EmployeeEntity employeeEntity) {
		log.info("Saving Employee: {}", employeeEntity);
		service.saveEmployee(employeeEntity);
		return new ResponseEntity<>(employeeEntity, HttpStatus.CREATED);
	}

	@PutMapping(path = "/updateEmployee")
	public EmployeeEntity update(@RequestBody EmployeeEntity employeeEntity) {
		service.saveEmployee( employeeEntity );
		log.info("Employee Updated");
		return employeeEntity;
	}

}
