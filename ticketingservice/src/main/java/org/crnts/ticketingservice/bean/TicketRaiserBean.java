package org.crnts.ticketingservice.bean;

import org.crnts.ticketingservice.entity.PriorityEntity;
import org.crnts.ticketingservice.entity.StatusEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
public class TicketRaiserBean {

	private long incidentId;

	private long requesterId;
	
	private long resolverDepartmentId;
	
	private long issueTypeId;
	
	private PriorityBean priorityBean;
	
	private StatusBean statusBean;
	
	private CommentsOnIssuesBean commentsOnIssuesBean ;

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

	public PriorityBean getPriorityBean() {
		return priorityBean;
	}

	public void setPriorityBean(PriorityBean priorityBean) {
		this.priorityBean = priorityBean;
	}

	public StatusBean getStatusBean() {
		return statusBean;
	}

	public void setStatusBean(StatusBean statusBean) {
		this.statusBean = statusBean;
	}

	public TicketRaiserBean(long incidentId, long requesterId, long resolverDepartmentId, long issueTypeId,
			PriorityBean priorityBean, StatusBean statusBean) {
		super();
		this.incidentId = incidentId;
		this.requesterId = requesterId;
		this.resolverDepartmentId = resolverDepartmentId;
		this.issueTypeId = issueTypeId;
		this.priorityBean = priorityBean;
		this.statusBean = statusBean;
	}

	public TicketRaiserBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
