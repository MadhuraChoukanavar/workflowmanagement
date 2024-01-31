package org.crnts.adminservice.serviceimpl;

import java.util.List;

import org.crnts.adminservice.bean.DepartmentBean;
import org.crnts.adminservice.bean.EmployeeBean;

import org.crnts.adminservice.controller.EmployeeController;

import org.crnts.adminservice.entity.DepartmentEntity;

import org.crnts.adminservice.entity.EmployeeEntity;
import org.crnts.adminservice.exception.EmployeeNotFoundException;
import org.crnts.adminservice.repository.EmployeeRepository;
import org.crnts.adminservice.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {
	private static Logger log = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired(required = true)
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeeEntity getById(Long id) {
		return employeeRepository.findById(id).orElse(null);
	}

	@Override
	

	public EmployeeEntity saveEmployee(EmployeeBean employeeBean) {
		
		// Convert EmployeeBean to EmployeeEntity
        EmployeeEntity employeeEntity = beanToEntity(employeeBean);

        // Save the EmployeeEntity
        employeeEntity = employeeRepository.save(employeeEntity);

        return employeeEntity;
	}

	@Override

	public void saveEmployee(EmployeeEntity employeeEntity) {
		repository.save(employeeEntity);
		//log.info("Employee Saved : ", employeeEntity);

	public void updateEmplyeeDetails(EmployeeEntity updatedEmployee, Long id) {
		EmployeeEntity existingEmployee = employeeRepository.findById(id)
				.orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id: " + id));

		existingEmployee.setEmployeeName(updatedEmployee.getEmployeeName());
		existingEmployee.setEmployeeEmail(updatedEmployee.getEmployeeEmail());
		existingEmployee.setEmployeeDesignation(updatedEmployee.getEmployeeDesignation());
		existingEmployee.setEmployeePassword(updatedEmployee.getEmployeePassword());
		existingEmployee.setEmployeePhonenumber(updatedEmployee.getEmployeePhonenumber());
		employeeRepository.save(existingEmployee);

	}

	@Override

	public void updateEmplyeeDetails(EmployeeEntity updatedEmployee, Long id) {
		EmployeeEntity existingEmployee = repository.findById(id)
				.orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id: " + id));

		existingEmployee.setEmployeeName(updatedEmployee.getEmployeeName());
		existingEmployee.setEmployeeEmail(updatedEmployee.getEmployeeEmail());
		existingEmployee.setEmployeeDesignation(updatedEmployee.getEmployeeDesignation());
		existingEmployee.setEmployeePassword(updatedEmployee.getEmployeePassword());
		existingEmployee.setEmployeePhonenumber(updatedEmployee.getEmployeePhonenumber());
		repository.save(existingEmployee);

	public List<EmployeeEntity> getEmployeesByDepartment(DepartmentEntity department) {
		return employeeRepository.findByEmployeeDepartmentId(department);

	}

	// conversion entity to bean and visa versa
	public EmployeeBean entityToBean(EmployeeEntity entity) {
		EmployeeBean employeeBean = new EmployeeBean();

		employeeBean.setEmployeeId(entity.getEmployeeId());
		employeeBean.setEmployeeName(entity.getEmployeeName());
		employeeBean.setEmployeeEmail(entity.getEmployeeEmail());
		employeeBean.setEmployeePassword(entity.getEmployeePassword());
		employeeBean.setEmployeePhonenumber(entity.getEmployeePhonenumber());
		employeeBean.setEmployeeDesignation(entity.getEmployeeDesignation());
		
		// Mapping DepartmentEntity to DepartmentBean
	    DepartmentEntity departmentEntity = entity.getEmployeeDepartmentId();
	    DepartmentBean departmentBean = new DepartmentBean();
	    departmentBean.setDepartmentId(departmentEntity.getDepartmentId());
	    // Set the DepartmentBean in EmployeeBean
	    employeeBean.setEmployeeDepartmentId(departmentBean);
	    
		return employeeBean;
	}

	public EmployeeEntity beanToEntity(EmployeeBean employeeBean) {
		EmployeeEntity entity = new EmployeeEntity();

		entity.setEmployeeId(employeeBean.getEmployeeId());
		entity.setEmployeeName(employeeBean.getEmployeeName());
		entity.setEmployeeEmail(employeeBean.getEmployeeEmail());
		entity.setEmployeePassword(employeeBean.getEmployeePassword());
		entity.setEmployeePhonenumber(employeeBean.getEmployeePhonenumber());
		// Assuming you have a DepartmentBean to DepartmentEntity conversion method
	    DepartmentEntity departmentEntity = convertToEntity(employeeBean.getEmployeeDepartmentId());
	    entity.setEmployeeDepartmentId(departmentEntity);
		return entity;
	}
	
	private DepartmentEntity convertToEntity(DepartmentBean departmentBean) {
	    // Your DepartmentBean to DepartmentEntity conversion logic
	    DepartmentEntity departmentEntity = new DepartmentEntity();
	    departmentEntity.setDepartmentId(departmentBean.getDepartmentId());
	    departmentEntity.setDepartmentName(departmentBean.getDepartmentName());

	    return departmentEntity;
	}

}
