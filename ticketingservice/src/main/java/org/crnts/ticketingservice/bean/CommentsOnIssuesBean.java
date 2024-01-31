package org.crnts.ticketingservice.bean;

import java.util.List;

public class CommentsOnIssuesBean {
	
	private long commentid;
	
	private String comments;
	
    private List<TicketRaiserBean> ticketRaiserBean;


	public List<TicketRaiserBean> getTicketRaiserBean() {
		return ticketRaiserBean;
	}

	public void setTicketRaiserBean(List<TicketRaiserBean> ticketRaiserBean) {
		this.ticketRaiserBean = ticketRaiserBean;
	}
	

	public long getCommentid() {
		return commentid;
	}

	public void setCommentid(long commentid) {
		this.commentid = commentid;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}



	
	public CommentsOnIssuesBean(long commentid, String comments, List<TicketRaiserBean> ticketRaiserBean) {
		super();
		this.commentid = commentid;
		this.comments = comments;
		this.ticketRaiserBean = ticketRaiserBean;
	}

	public CommentsOnIssuesBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
