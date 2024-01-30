package org.crnts.ticketingservice.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
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
	
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "status_code", referencedColumnName = "status_code")
//	private StatusEntity statusEntity;

<<<<<<< HEAD
	
	
	
=======
>>>>>>> master
}
