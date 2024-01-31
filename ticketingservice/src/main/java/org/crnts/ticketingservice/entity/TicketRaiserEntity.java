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

	public long getIncidentId() {
		return incidentId;
	}

	public TicketRaiserEntity(long incidentId, long requesterId, long resolverDepartmentId, long issueTypeId,
			PriorityEntity priorityEntity, StatusEntity statusEntity) {
		super();
		this.incidentId = incidentId;
		this.requesterId = requesterId;
		this.resolverDepartmentId = resolverDepartmentId;
		this.issueTypeId = issueTypeId;
		this.priorityEntity = priorityEntity;
		this.statusEntity = statusEntity;
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

	public long getResolverDepartmentId() {
		return resolverDepartmentId;
	}

	public void setResolverDepartmentId(long resolverDepartmentId) {
		this.resolverDepartmentId = resolverDepartmentId;
	}

	public long getIssueTypeId() {
		return issueTypeId;
	}

	public void setIssueTypeId(long issueTypeId) {
		this.issueTypeId = issueTypeId;
	}

	public PriorityEntity getPriorityEntity() {
		return priorityEntity;
	}

	public void setPriorityEntity(PriorityEntity priorityEntity) {
		this.priorityEntity = priorityEntity;
	}

	public StatusEntity getStatusEntity() {
		return statusEntity;
	}

	public void setStatusEntity(StatusEntity statusEntity) {
		this.statusEntity = statusEntity;
	}

	

	

	public TicketRaiserEntity() {
		super();
		
	}

}
