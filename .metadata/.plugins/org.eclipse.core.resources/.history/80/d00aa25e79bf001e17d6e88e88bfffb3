package org.crnts.ticketingservice.entity;

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
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Table(name = "status_details")
public class StatusEntity {
	@Id
	@Column(name = "status_code")
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String statusCode;

	@Column(name = "status_name")
	private String statusName;
	
	
    
<<<<<<< HEAD
=======
	public StatusEntity() {
		super();
		
	}


	public StatusEntity(String statusCode, String statusName) {
		super();
		this.statusCode = statusCode;
		this.statusName = statusName;
	}
	

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
>>>>>>> master
	

}
