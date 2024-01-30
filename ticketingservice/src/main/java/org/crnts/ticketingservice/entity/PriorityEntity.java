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
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Getter
@Setter
@Table(name = "priority_details")
public class PriorityEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="priority_id")
	private int priorityId;
	
	@Column(name="priority_name")
	private String priorityName;
	
	  @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	   @Column(name="resolution_time")
	private String resolutionTime;


	

}
