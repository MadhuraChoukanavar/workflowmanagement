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
//@Builder
@ToString
public class TicketRaiserBean {
	
    private long incidentId;
	
	
	private long requesterId;
	

	private long departmentId;
	

	private long issueTypeId;
	
	
	private int priorityId;
	

	private int statusId;

}
