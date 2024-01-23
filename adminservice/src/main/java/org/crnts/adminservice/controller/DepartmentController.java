package org.crnts.adminservice.controller;

import java.util.List;

import org.crnts.adminservice.entity.DepartmentEntity;
import org.crnts.adminservice.exception.DepartmentNotFoundException;
import org.crnts.adminservice.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/department")
public class DepartmentController {
	private static Logger log = LoggerFactory.getLogger(DepartmentController.class);
	@Autowired
	private DepartmentService departmentService;

	@PostMapping
	public ResponseEntity<DepartmentEntity> save(@RequestBody DepartmentEntity departmentEntity) {
		log.info("Saving department details {}", departmentEntity);
		departmentService.save(departmentEntity);

		ResponseEntity<DepartmentEntity> responseEntity = new ResponseEntity<>(departmentEntity, HttpStatus.CREATED);
		return responseEntity;

	}
	@GetMapping(path = "/{departmentId}")
	public ResponseEntity<DepartmentEntity> get(@PathVariable Long departmentId) {
		log.info("Fetching department_details {}", departmentId);

		DepartmentEntity departmentEntity = departmentService.get(departmentId);

		ResponseEntity<DepartmentEntity> responseEntity = new ResponseEntity<>(departmentEntity,
				HttpStatus.OK);
		return responseEntity;
	}
	@GetMapping
	public ResponseEntity<List<DepartmentEntity>>getAll(){
		List<DepartmentEntity>departmentEntity=departmentService.getAll();
		log.info("Fetching department_details {}", departmentEntity);
		ResponseEntity<List<DepartmentEntity>> responseEntity = new ResponseEntity<List<DepartmentEntity>>(departmentEntity,
				HttpStatus.OK);
		return responseEntity;
		
	}
	@PutMapping
	public ResponseEntity<DepartmentEntity>update(@RequestBody DepartmentEntity departmentEntity){
		try {
			departmentService.update(departmentEntity);
			log.info("Update department_details {}", departmentEntity);
			ResponseEntity<DepartmentEntity>responseEntity = new ResponseEntity<DepartmentEntity>(departmentEntity,
					HttpStatus.OK);
			return responseEntity;
		}catch(DepartmentNotFoundException e) {
			System.out.println(e.getMessage());
			ResponseEntity<DepartmentEntity>responseEntity = new ResponseEntity<DepartmentEntity>(departmentEntity,
					HttpStatus.NOT_FOUND);
		}
		return null;
	
		
		
		
	}
	@DeleteMapping(path = "/{departmentId}")
	public ResponseEntity<DepartmentEntity>delate(@PathVariable Long departmentId){
		DepartmentEntity departmentEntity	=departmentService.delete(departmentId);
		log.info("Delete department_details {}", departmentId);
		ResponseEntity<DepartmentEntity>responseEntity = new ResponseEntity<DepartmentEntity>(departmentEntity,
				HttpStatus.OK);
		return responseEntity;
		
	}

}
