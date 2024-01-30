package org.crnts.adminservice.service;

import java.util.List;

import org.crnts.adminservice.entity.DepartmentEntity;

public interface DepartmentService {
	
	void save(DepartmentEntity departmentEntity);

	List<DepartmentEntity> getAll();

	DepartmentEntity getDepartmentById(Long id);
	
	void update(DepartmentEntity departmentEntity );
	
	DepartmentEntity delete(Long departmentId);
}
