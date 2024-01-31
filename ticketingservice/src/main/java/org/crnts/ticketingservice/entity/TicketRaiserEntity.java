package org.crnts.ticketingservice.entity;

import jakarta.persistence.CascadeType;

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
@ToString
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
<<<<<<< HEAD
@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
=======
>>>>>>> 61ce05bf8ead2e048ff3b007c582699371c8696d
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
	
	

<<<<<<< HEAD
	
	
	
=======
>>>>>>> master
}
