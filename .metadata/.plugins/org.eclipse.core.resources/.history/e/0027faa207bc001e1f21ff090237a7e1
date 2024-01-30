package org.crnts.ticketingservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


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
	
	@Column(name = "issue_type_id")
	private long issueTypeId;
	
	@Column(name = "priority_id")
	private int priorityId;
	
	@Column(name = "status_code")
	private String statusCode;
	
	

	public TicketRaiserEntity(long incidentId, long requesterId, long resolverDepartmentId, long issueTypeId, int priorityId,
			String statusCode) {
		super();
		this.incidentId = incidentId;
		this.requesterId = requesterId;
		this.resolverDepartmentId = resolverDepartmentId;
		this.issueTypeId = issueTypeId;
		this.priorityId = priorityId;
		this.statusCode = statusCode;
	}
	

	public TicketRaiserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getIncidentId() {
		return incidentId;
	}

	public void setIncidentId(long incidentId) {
		this.incidentId = incidentId;
	}

	public long getRequesterId() {
		return requesterId;
	}

	public void setRequesterId(long requesterId) {
		this.requesterId = requesterId;
	}

	public long getresolverDepartmentId() {
		return resolverDepartmentId;
	}

	public void setresolverDepartmentId(long resolverDepartmentId) {
		this.resolverDepartmentId = resolverDepartmentId;
	}

	public long getIssueTypeId() {
		return issueTypeId;
	}

	public void setIssueTypeId(long issueTypeId) {
		this.issueTypeId = issueTypeId;
	}

	public int getPriorityId() {
		return priorityId;
	}

	public void setPriorityId(int priorityId) {
		this.priorityId = priorityId;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	
	
}
