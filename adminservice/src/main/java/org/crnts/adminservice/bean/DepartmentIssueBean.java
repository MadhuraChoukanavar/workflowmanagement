package org.crnts.adminservice.bean;


public class DepartmentIssueBean {


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DepartmentIssueBean {
	private long issueId;
	private String issueName;
	private long departmentId;
	
	

}