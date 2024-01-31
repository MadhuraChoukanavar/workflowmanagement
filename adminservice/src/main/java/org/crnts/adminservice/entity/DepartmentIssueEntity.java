package org.crnts.adminservice.entity;


import jakarta.persistence.CascadeType;




import jakarta.annotation.Generated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.SecondaryTable;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
@Table(name = "department_issue_types")
public class DepartmentIssueEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "issue_type_id")
	private long issueId;
	@Column(name = "issue_type_name")
	private String issueName;


	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "department_id",referencedColumnName = "department_id")
	private DepartmentEntity departmentEntity;

}

	@Column(name = "department_id")
	private long departmentId;

}

