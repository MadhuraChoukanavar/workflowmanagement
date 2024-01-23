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
public class StatusBean {

	private int statusId;
	private String statusName;

}
