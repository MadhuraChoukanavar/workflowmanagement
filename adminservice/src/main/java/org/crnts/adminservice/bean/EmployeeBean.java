package org.crnts.adminservice.bean;

import org.crnts.adminservice.entity.DepartmentEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class EmployeeBean {

	private Long employeeId;
	private String employeeName;
	private String employeeEmail;
	private Long employeePhonenumber;
	private DepartmentBean employeeDepartmentId;
	private String employeePassword;
	private String employeeDesignation;
	
	

}
