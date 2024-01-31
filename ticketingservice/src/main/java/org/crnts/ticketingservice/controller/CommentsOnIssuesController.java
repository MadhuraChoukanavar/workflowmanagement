package org.crnts.ticketingservice.controller;

import org.crnts.ticketingservice.bean.CommentsOnIssuesBean;
import org.crnts.ticketingservice.bean.TicketRaiserBean;
import org.crnts.ticketingservice.entity.CommentsOnIssues;
import org.crnts.ticketingservice.entity.StatusEntity;
import org.crnts.ticketingservice.entity.TicketRaiserEntity;
import org.crnts.ticketingservice.repository.CommentsOnIssuesRepository;
import org.crnts.ticketingservice.service.CommentsOnIssuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comments")
public class CommentsOnIssuesController {
	

	@Autowired
	private CommentsOnIssuesRepository commentsOnIssuesRepository;
	
	@Autowired
	private CommentsOnIssuesService commentsOnIssuesService;
	
//	@PostMapping("/save")
//	public ResponseEntity<CommentsOnIssues> save(@RequestBody  CommentsOnIssuesBean commentsOnIssuesBean) {
//		CommentsOnIssues savedEntity = commentsOnIssuesService.save(commentsOnIssuesBean);
//        ResponseEntity<CommentsOnIssues> responseEntity = new ResponseEntity<>(savedEntity, HttpStatus.OK);
//        return responseEntity;
//	}
//	
	
	@PostMapping("/save")
    public ResponseEntity<CommentsOnIssues>	 save(@RequestBody CommentsOnIssues commentsOnIssues ){
		
		commentsOnIssuesService.save(commentsOnIssues);
		ResponseEntity<CommentsOnIssues> responseEntity1 = new ResponseEntity<>(commentsOnIssues, HttpStatus.OK);
		return responseEntity1 ;
		
	}

}
