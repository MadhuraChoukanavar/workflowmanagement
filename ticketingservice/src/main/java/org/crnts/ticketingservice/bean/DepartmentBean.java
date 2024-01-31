package org.crnts.ticketingservice.bean;

import jakarta.persistence.Entity;


public class DepartmentBean {
	private long departmentId;
	private String departmentName;

	public long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "DepartmentBean [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}

	public DepartmentBean(long departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	public DepartmentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	


}
