package org.crnts.ticketingservice.bean;

public class PriorityBean {
	
	private int priorityId;
	
	private String priorityName;
	
	private String resolutionTime;

	public int getPriorityId() {
		return priorityId;
	}

	public void setPriorityId(int priorityId) {
		this.priorityId = priorityId;
	}

	public String getPriorityName() {
		return priorityName;
	}

	public void setPriorityName(String priorityName) {
		this.priorityName = priorityName;
	}

	public String getResolutionTime() {
		return resolutionTime;
	}

	public void setResolutionTime(String resolutionTime) {
		this.resolutionTime = resolutionTime;
	}

	public PriorityBean(int priorityId, String priorityName, String resolutionTime) {
		super();
		this.priorityId = priorityId;
		this.priorityName = priorityName;
		this.resolutionTime = resolutionTime;
	}

	public PriorityBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
