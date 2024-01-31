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
<<<<<<< HEAD
=======
	public StatusEntity() {
		super();
		
	}
=======
>>>>>>> 61ce05bf8ead2e048ff3b007c582699371c8696d

	


<<<<<<< HEAD
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
	
=======
>>>>>>> 61ce05bf8ead2e048ff3b007c582699371c8696d

}
