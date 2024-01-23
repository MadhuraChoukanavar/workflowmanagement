package org.crnts.adminservice.service;

import org.crnts.adminservice.entity.EmployeeEntity;

public interface EmployeeService {

	public void saveEmployee(EmployeeEntity employeeEntity);

	public EmployeeEntity getById(Long Id);

	public void updateEmplyeeDetails( EmployeeEntity updateEmplyee, Long id);
}
