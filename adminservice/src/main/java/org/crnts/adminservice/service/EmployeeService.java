package org.crnts.adminservice.service;

import java.util.List;

import org.crnts.adminservice.bean.EmployeeBean;
import org.crnts.adminservice.entity.DepartmentEntity;
import org.crnts.adminservice.entity.EmployeeEntity;

public interface EmployeeService {

	public EmployeeEntity saveEmployee(EmployeeBean employeeBean);

	public EmployeeEntity getById(Long Id);

	public void updateEmplyeeDetails(EmployeeEntity updateEmplyee, Long id);

	public List<EmployeeEntity> getEmployeesByDepartment(DepartmentEntity department);
}
