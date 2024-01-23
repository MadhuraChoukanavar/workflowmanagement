package org.crnts.adminservice.entity;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.validator.constraints.UniqueElements;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "department_issue_types")
public class DepartmentIssueEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "issue_type_id")
	private long issueId;
	@Column(name = "issue_type_name")
//	@UniqueElements(message = "Already Issuname exist")
	private String issueName;
	
	@Column(name = "department_id")
	private long departmentId;
	
//	@ManyToOne(targetEntity =DepartmentEntity.class)
//	@JoinColumn(name = "departmentId")
//	@JsonBackReference("departmentId")
//	private DepartmentEntity departmentId;
	
	

	

	
	public long getDepartmentId() {
		return departmentId;
	}



	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}



	
	

	public DepartmentIssueEntity(long issueId, String issueName, long departmentId) {
		super();
		this.issueId = issueId;
		this.issueName = issueName;
		this.departmentId = departmentId;
	}



	public DepartmentIssueEntity() {
		super();
		// TODO Auto-generated constructor stub
	}



	public long getIssueId() {
		return issueId;
	}

	public void setIssueId(long issueId) {
		this.issueId = issueId;
	}

	public String getIssueName() {
		return issueName;
	}

	public void setIssueName(String issueName) {
		this.issueName = issueName;
	}



	@Override
	public String toString() {
		return "DepartmentIssueEntity [issueId=" + issueId + ", issueName=" + issueName + ", departmentId="
				+ departmentId + "]";
	}

	

	
}
