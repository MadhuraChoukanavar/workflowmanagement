package org.crnts.adminservice.serviceimpl;

import org.crnts.adminservice.bean.EmployeeBean;
import org.crnts.adminservice.controller.EmployeeController;
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
	private EmployeeRepository repository;

	@Override
	public EmployeeEntity getById(Long id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void saveEmployee(EmployeeEntity employeeEntity) {
		repository.save(employeeEntity);
		log.info("Employee Saved : ", employeeEntity);
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
	}

	// conversion entity to bean and visa versa
	public EmployeeBean entityToBean(EmployeeEntity entity) {
		EmployeeBean employeeBean = new EmployeeBean();

		employeeBean.setEmployeeId(entity.getEmployeeId());
		employeeBean.setEmployeeName(entity.getEmployeeName());
		employeeBean.setEmployeeEmail(entity.getEmployeeEmail());
		employeeBean.setEmployeePassword(entity.getEmployeePassword());
		employeeBean.setEmployeePhonenumber(entity.getEmployeePhonenumber());
		return employeeBean;
	}

	public EmployeeEntity beanToEntity(EmployeeBean employeeBean) {
		EmployeeEntity entity = new EmployeeEntity();

		entity.setEmployeeId(employeeBean.getEmployeeId());
		entity.setEmployeeName(employeeBean.getEmployeeName());
		entity.setEmployeeEmail(employeeBean.getEmployeeEmail());
		entity.setEmployeePassword(employeeBean.getEmployeePassword());
		entity.setEmployeePhonenumber(employeeBean.getEmployeePhonenumber());
		return entity;
	}

}
