package org.crnts.ticketingservice.entity;

import org.crnts.ticketingservice.bean.DepartmentBean;
import org.crnts.ticketingservice.bean.DepartmentIssueBean;
import org.crnts.ticketingservice.bean.EmployeeBean;

import jakarta.persistence.CascadeType;

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
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "incident_details")
public class TicketRaiserEntity {

	@Id
	@Column(name = "incident_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long incidentId;

	@Column(name = "requester_id")
	private long requesterId;

	@Column(name = "resolver_department_id")
	private long resolverDepartmentId;

	@Column(name = "issue_type_id ")
	private long issueTypeId;

	@OneToOne
	@JoinColumn(name = "priority_id", referencedColumnName = "priority_id")
	private PriorityEntity priorityEntity;

	@OneToOne
	@JoinColumn(name = "status_code", referencedColumnName = "status_code")
	private StatusEntity statusEntity;

	@ManyToOne
	@JoinColumn(name = "comment_id", referencedColumnName = "comment_id")
	private  CommentsOnIssues commentsOnIssues;



	

	



}
