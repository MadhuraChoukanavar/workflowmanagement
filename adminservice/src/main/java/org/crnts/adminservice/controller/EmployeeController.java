package org.crnts.adminservice.controller;

import java.util.List;

import org.crnts.adminservice.bean.EmployeeBean;
import org.crnts.adminservice.entity.DepartmentEntity;
import org.crnts.adminservice.entity.EmployeeEntity;
import org.crnts.adminservice.service.DepartmentService;
import org.crnts.adminservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PatchMapping;
=======
>>>>>>> master
=======

import org.springframework.web.bind.annotation.PatchMapping;

>>>>>>> 61ce05bf8ead2e048ff3b007c582699371c8696d
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/saveEmployee")
<<<<<<< HEAD
	public ResponseEntity<EmployeeEntity> saveEmployee(@RequestBody EmployeeEntity employeeEntity) {
//		log.info("Saving Employee: {}", employeeEntity);
		service.saveEmployee(employeeEntity);
		return new ResponseEntity<>(employeeEntity, HttpStatus.CREATED);
=======
	public ResponseEntity<EmployeeEntity> saveEmployee(@RequestBody EmployeeBean employeeBean) {
		log.info("Saving Employee: {}", employeeBean);
		
        EmployeeEntity savedEmployeeEntity = employeeService.saveEmployee(employeeBean);
        return new ResponseEntity<>(savedEmployeeEntity, HttpStatus.CREATED);
>>>>>>> master
	}
	
	@PostMapping(path = "/updateEmployee/{id}")
	public ResponseEntity<EmployeeEntity> update(@RequestBody EmployeeEntity employeeEntity, @PathVariable Long id) {
<<<<<<< HEAD
		service.updateEmplyeeDetails(employeeEntity, id);
//		log.info("Employee Updated");
=======
		employeeService.updateEmplyeeDetails(employeeEntity, id);
		log.info("Employee Updated");
>>>>>>> master
		return new ResponseEntity<>(employeeEntity, HttpStatus.OK);
	}
	
	@GetMapping(path = "/getEmployee/{id}")
	public ResponseEntity<EmployeeEntity> getEmployeeById(@PathVariable Long id) {
<<<<<<< HEAD
		EmployeeEntity byId = service.getById(id);
=======
		EmployeeEntity byId = employeeService.getById(id);
>>>>>>> 61ce05bf8ead2e048ff3b007c582699371c8696d
		log.info("Employee Fetched"+byId.toString());
		return new ResponseEntity<>(byId, HttpStatus.OK);
	}
	
	


	@GetMapping("/departmentEmployee/{departmentId}")
	public List<EmployeeEntity> getEmployeesByDepartment(@PathVariable Long departmentId) {
		DepartmentEntity department = departmentService.getDepartmentById(departmentId);
		// Check if the department exists, then retrieve employees
		if (department != null) {
			return employeeService.getEmployeesByDepartment(department);
		} else {
			return null;
		}
	}
}
