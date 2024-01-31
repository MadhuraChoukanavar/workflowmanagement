package org.crnts.ticketingservice.entity;

import java.sql.Blob;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CommentsOnIssues {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "comment_id")
	private long commentid;

	@OneToOne
	@JoinColumn(name = "incident_id", referencedColumnName = "incident_id")
	private TicketRaiserEntity ticketRaiserEntity;

	@Column(name = "comments", columnDefinition = "BLOB")
	private byte[] comments;

	public long getCommentid() {
		return commentid;
	}

	public void setCommentid(long commentid) {
		this.commentid = commentid;
	}

	public CommentsOnIssues(long commentid, TicketRaiserEntity ticketRaiserEntity, byte[] comments) {
		super();
		this.commentid = commentid;
		this.ticketRaiserEntity = ticketRaiserEntity;
		this.comments = comments;
	}

	public byte[] getComments() {
		return comments;
	}

	public void setComments(byte[] comments) {
		this.comments = comments;
	}

	public TicketRaiserEntity getTicketRaiserEntity() {
		return ticketRaiserEntity;
	}

	public void setTicketRaiserEntity(TicketRaiserEntity ticketRaiserEntity) {
		this.ticketRaiserEntity = ticketRaiserEntity;
	}

	public CommentsOnIssues() {
		super();
	}

}
