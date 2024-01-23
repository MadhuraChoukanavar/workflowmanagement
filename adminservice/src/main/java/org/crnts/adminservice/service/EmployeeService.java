package org.crnts.adminservice.service;

import org.crnts.adminservice.bean.EmployeeBean;
import org.crnts.adminservice.entity.EmployeeEntity;

public interface EmployeeService {

	public void saveEmployee(EmployeeEntity employeeEntity);

	public EmployeeEntity getById(Long Id);

	public void updateEmplyee( EmployeeEntity employeeEntity, Long id);
}
