package org.crnts.ticketingservice.entity;

import org.springframework.format.annotation.DateTimeFormat;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Table(name = "incident_resolving_details")
public class IncidentResolvingEntity {
	@Id
	@Column(name = "resolving_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long resolvingId;
	@Column(name = "incident_id")
	private long incidentId;
	//employee_id	
	@Column(name="resolver_id")
	private long resolverId;
	@Column(name="status_code")
	private String statusCode;
	   @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	   @Column(name="response_time")
	private String responseTime;
	//fetch resolution time
	//@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	   @Column(name="priority_id")
	private int priorityId;
	   
	   
	   public void printMe()
	   {
		   System.out.println(incidentId+" \t"+resolverId+" \t"+statusCode);
	   }


	public long getResolvingId() {
		return resolvingId;
	}


	public void setResolvingId(long resolvingId) {
		this.resolvingId = resolvingId;
	}


	public long getIncidentId() {
		return incidentId;
	}


	public void setIncidentId(long incidentId) {
		this.incidentId = incidentId;
	}


	public long getResolverId() {
		return resolverId;
	}


	public void setResolverId(long resolverId) {
		this.resolverId = resolverId;
	}


	public String getStatusCode() {
		return statusCode;
	}


	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}


	public String getResponseTime() {
		return responseTime;
	}


	public void setResponseTime(String responseTime) {
		this.responseTime = responseTime;
	}


	public int getPriorityId() {
		return priorityId;
	}


	public void setPriorityId(int priorityId) {
		this.priorityId = priorityId;
	}
	   
}
