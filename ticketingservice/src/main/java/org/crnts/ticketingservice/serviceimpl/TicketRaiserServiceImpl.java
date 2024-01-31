package org.crnts.ticketingservice.serviceimpl;

import org.crnts.adminservice.entity.EmployeeEntity;
import org.crnts.ticketingservice.bean.DepartmentBean;
import org.crnts.ticketingservice.bean.EmployeeBean;
import org.crnts.ticketingservice.bean.PriorityBean;
import org.crnts.ticketingservice.bean.StatusBean;
import org.crnts.ticketingservice.bean.TicketRaiserBean;
import org.crnts.ticketingservice.entity.CommentsOnIssues;
import org.crnts.ticketingservice.entity.PriorityEntity;
import org.crnts.ticketingservice.entity.StatusEntity;
import org.crnts.ticketingservice.entity.TicketRaiserEntity;
import org.crnts.ticketingservice.repository.TicketRaiserRepository;
import org.crnts.ticketingservice.service.TicketRaiserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
@Service
public class TicketRaiserServiceImpl implements TicketRaiserService{
	
	@Autowired
	private TicketRaiserRepository ticketRaiserRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@Override
	public DepartmentBean getDepartmentBean(long id) {
		
		String url = "http://localhost:8082/api/department/"+id ;
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> httpEntity = new HttpEntity<>(headers);
		
		ResponseEntity<DepartmentBean> responseEntity=restTemplate.exchange(url,HttpMethod.GET,httpEntity, DepartmentBean.class);
		DepartmentBean departmentBean=responseEntity.getBody();
		return departmentBean;
			
	}
	
	@Override
	public TicketRaiserEntity save(TicketRaiserBean ticketRaiserBean) {
		
		TicketRaiserEntity ticketRaiserEntity =beanToEntity(ticketRaiserBean);
        TicketRaiserEntity savedEntity = ticketRaiserRepository.save(ticketRaiserEntity);
        
        return savedEntity;
	}
	


	
	
	
	// conversion entity to bean and visa versa
		public TicketRaiserEntity beanToEntity(TicketRaiserBean ticketRaiserBean ) {
			TicketRaiserEntity ticketRaiserEntity=new TicketRaiserEntity();
		ticketRaiserEntity.setIssueTypeId(ticketRaiserBean.getIssueTypeId());
			ticketRaiserEntity.setRequesterId(ticketRaiserBean.getRequesterId());
			ticketRaiserEntity.setResolverDepartmentId(ticketRaiserBean.getResolverDepartmentId());	
			// Convert PriorityBean to PriorityEntity
		    PriorityEntity priorityEntity = new PriorityEntity();
		    priorityEntity.setPriorityId(ticketRaiserBean.getPriorityBean().getPriorityId());
///		    priorityEntity.setPriorityName(ticketRaiserBean.getPriorityBean().getPriorityName());
///		    priorityEntity.setResponseTime(ticketRaiserBean.getPriorityBean().getResolutionTime());
		    ticketRaiserEntity.setPriorityEntity(priorityEntity);
		    
		    StatusEntity statusEntity = new StatusEntity();
		    statusEntity.setStatusCode(ticketRaiserBean.getStatusBean().getStatusCode());
	//	    statusEntity.setStatusName(ticketRaiserBean.getStatusBean().getStatusName());
		    ticketRaiserEntity.setStatusEntity(statusEntity);
		    
//		    CommentsOnIssues  commentsOnIssues = new  CommentsOnIssues();
//		    commentsOnIssues.setCommentid(ticketRaiserBean.get);
		    
		    return ticketRaiserEntity;
		}
		
		
		public TicketRaiserBean entityToBean(TicketRaiserEntity ticketRaiserEntity) {
			TicketRaiserBean ticketRaiserBean=new TicketRaiserBean();
			ticketRaiserBean.setIncidentId(ticketRaiserEntity.getIncidentId());
			ticketRaiserBean.setIssueTypeId(ticketRaiserEntity.getIssueTypeId());
			ticketRaiserBean.setRequesterId(ticketRaiserEntity.getRequesterId());
			ticketRaiserBean.setResolverDepartmentId(ticketRaiserEntity.getResolverDepartmentId());
			// Convert PriorityEntity to PriorityBean
		    PriorityBean priorityBean = new PriorityBean();
		    priorityBean.setPriorityId(ticketRaiserEntity.getPriorityEntity().getPriorityId());
		    ticketRaiserBean.setPriorityBean(priorityBean);
		    
		    // Convert StatusEntity to StatusBean
		    StatusBean statusBean = new StatusBean();
		    statusBean.setStatusCode(ticketRaiserEntity.getStatusEntity().getStatusCode());
		    ticketRaiserBean.setStatusBean(statusBean);
		    return ticketRaiserBean;
		}






		
		
		
}


