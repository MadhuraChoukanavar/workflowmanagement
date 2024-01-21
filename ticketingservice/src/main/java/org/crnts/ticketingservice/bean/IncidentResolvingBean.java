package org.crnts.ticketingservice.bean;

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
@Builder
@ToString
public class IncidentResolvingBean {

	private long resolvingId;
	private long incidentId;
	//employee_id	
	private long resolverId;
	private long statusCode;
	private String responseTime;
	//fetch resolution time
	private String priorityId;
}