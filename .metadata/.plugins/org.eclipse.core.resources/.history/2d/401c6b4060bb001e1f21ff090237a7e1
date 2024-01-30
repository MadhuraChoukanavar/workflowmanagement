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
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Data
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
//
//	public int getPriorityId() {
//		return priorityId;
//	}
//
//	public void setPriorityId(int priorityId) {
//		this.priorityId = priorityId;
//	}
//
//	public String getPriorityName() {
//		return priorityName;
//	}
//
//	public void setPriorityName(String priorityName) {
//		this.priorityName = priorityName;
//	}
//
//	public String getResponseTime() {
//		return resolutionTime;
//	}
//
//	public void setResponseTime(String resolutionTime) {
//		this.resolutionTime = resolutionTime;
//	}
	  

}
