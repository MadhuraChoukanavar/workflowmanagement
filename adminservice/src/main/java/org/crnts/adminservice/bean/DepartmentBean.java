package org.crnts.adminservice.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


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

}
