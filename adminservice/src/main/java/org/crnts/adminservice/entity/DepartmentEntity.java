package org.crnts.adminservice.entity;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="Department_details")
public class DepartmentEntity {
	@Id
	@Column(name = "department_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private long departmentId;
	@Column(name = "department_name")
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
	public DepartmentEntity(long departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	public DepartmentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DepartmentEntity [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}
	

}
