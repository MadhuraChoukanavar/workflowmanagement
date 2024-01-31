package org.crnts.ticketingservice.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.crnts.ticketingservice.bean.CommentsOnIssuesBean;
import org.crnts.ticketingservice.bean.TicketRaiserBean;
import org.crnts.ticketingservice.entity.CommentsOnIssues;
import org.crnts.ticketingservice.entity.PriorityEntity;
import org.crnts.ticketingservice.entity.StatusEntity;
import org.crnts.ticketingservice.entity.TicketRaiserEntity;
import org.crnts.ticketingservice.repository.CommentsOnIssuesRepository;
import org.crnts.ticketingservice.service.CommentsOnIssuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class CommentsOnIssuesServiceImpl implements CommentsOnIssuesService{
	
	
	@Autowired
	private CommentsOnIssuesRepository commentsOnIssuesRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	

	@Override
	public void save(CommentsOnIssues commentsOnIssues) {
		
		commentsOnIssuesRepository.save(commentsOnIssues);
		
	}
	
	
//	public CommentsOnIssues beanToEntity(CommentsOnIssuesBean CommentsOnIssuesBean ) {
//		CommentsOnIssues commentsOnIssues = new CommentsOnIssues();
//		commentsOnIssues.setCommentid(CommentsOnIssuesBean.getCommentid());
//		commentsOnIssues.setComments(CommentsOnIssuesBean.getComments());
//		 List<TicketRaiserBean> ticketRaiserBeans = CommentsOnIssuesBean.getTicketRaiserBean();
//		    List<TicketRaiserEntity> ticketRaiserEntities = new ArrayList<>();
//		    for (TicketRaiserBean ticketRaiserBean : ticketRaiserBeans) {
//		        TicketRaiserEntity ticketRaiserEntity = new TicketRaiserEntity();
//		        ticketRaiserEntity.setIncidentId(ticketRaiserBean.getIncidentId());
//		        ticketRaiserEntities.add(ticketRaiserEntity);
//		    }
//		    commentsOnIssues.setTicketRaiserEntity(ticketRaiserEntities);
//		return commentsOnIssues;
//		
//	}
//	
//	public CommentsOnIssuesBean entityToBean(CommentsOnIssues commentsOnIssues) {
//		CommentsOnIssuesBean commentsOnIssuesBean=new CommentsOnIssuesBean();
//		commentsOnIssuesBean.setCommentid(commentsOnIssues.getCommentid());
//		commentsOnIssuesBean.setComments(commentsOnIssues.getComments());
//		 List<TicketRaiserEntity> ticketRaiserEntities = commentsOnIssues.getTicketRaiserEntity();
//		    List<TicketRaiserBean> ticketRaiserBeans = new ArrayList<>();
//		    for (TicketRaiserEntity ticketRaiserEntity : ticketRaiserEntities) {
//		        TicketRaiserBean ticketRaiserBean = new TicketRaiserBean();
//		        ticketRaiserBean.setIncidentId(ticketRaiserEntity.getIncidentId());
//		        ticketRaiserBeans.add(ticketRaiserBean);
//		    }
//		    commentsOnIssuesBean.setTicketRaiserBean(ticketRaiserBeans);
//		
//		return commentsOnIssuesBean;
		
		
		
		
	}


