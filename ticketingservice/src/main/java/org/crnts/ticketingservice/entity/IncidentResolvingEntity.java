package org.crnts.ticketingservice.entity;

import org.crnts.ticketingservice.bean.PriorityBean;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.Mapping;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
//	
//	@Column(name = "status_code")
//	private long statusCode;
//
//	  @OneToOne()
//	   @JoinColumn(name="resolver_id",referencedColumnName = "employee_id")
//		private EmployeeEntity employeeEntity;
	
	   @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	   @Column(name="response_time")
	   private String responseTime;
	
	   
	   @OneToOne()
	   @JoinColumn(name="status_code",referencedColumnName = "status_code")
		private StatusEntity statusEntity;
	   
	   @OneToOne()
	   @JoinColumn(name="priority_id",referencedColumnName = "priority_id")
	   private PriorityEntity priorityEntity;
	 
}
