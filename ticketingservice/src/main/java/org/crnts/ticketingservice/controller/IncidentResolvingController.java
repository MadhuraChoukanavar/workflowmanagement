package org.crnts.ticketingservice.controller;

import java.util.List;
import java.util.Optional;

import org.crnts.ticketingservice.bean.EmployeeBean;
import org.crnts.ticketingservice.bean.IncidentResolvingBean;

import org.crnts.ticketingservice.entity.IncidentResolvingEntity;

import org.crnts.ticketingservice.repository.IncidentResolvingRepository;
import org.crnts.ticketingservice.service.IncidentResolvingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/ticketing")
public class IncidentResolvingController {

	private static Logger log = LoggerFactory.getLogger(IncidentResolvingController.class);

	@Autowired
	IncidentResolvingService incidentResolvingService;

	@Autowired
	IncidentResolvingRepository incidentResolvingRepository;

	@Autowired
	private RestTemplate restTemplate;

	@PostMapping
	public ResponseEntity<IncidentResolvingEntity> save(@RequestBody IncidentResolvingBean incidentResolvingBean) {
		log.info("Saving incidentresolving {}", incidentResolvingBean);

		IncidentResolvingEntity saveEntity = incidentResolvingService.save(incidentResolvingBean);

		ResponseEntity<IncidentResolvingEntity> responseEntity = new ResponseEntity<>(saveEntity, HttpStatus.CREATED);

		System.out.println("hii i am saving");
		return responseEntity;
	}

//@GetMapping("/getEmployeee")
//public String getEmployee()
//{
//String empURL="http://localhost:8081/api/employee/getEmployee/2";
//HttpClient httpclient=HttpClient.newHttpClient();
//HttpRequest request=HttpRequest.newBuilder().uri(URI.create(empURL)).GET().build();
//try {
//	HttpResponse<String> response = httpclient.send(request,HttpResponse.BodyHandlers.ofString());
//	int statusCode=response.statusCode();
//	String responseBody=response.body();
//	System.out.print("Status"+statusCode);
//	System.out.print("Response"+responseBody);
//			
//return  responseBody;
//} catch (IOException | InterruptedException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
//return null;
//} 

	@PostMapping(path = "/updatepriority/{newpriority}/{incidentId}")

	public ResponseEntity<Object> updatePriorty(@PathVariable int newpriority, @PathVariable long incidentId) {
		try {
			incidentResolvingService.updatePriority(newpriority, incidentId);
			return new ResponseEntity<>(HttpStatus.OK);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
//
//	@PostMapping(path = "/updateIncidentResloving/{incidentId}")
//	public ResponseEntity<Object> updateIncidentResolving() {
//		return null;
//
//	}

	@PostMapping(path = "/updatestatus/{newstatus}/{resolvingId}")

	public ResponseEntity<Object> updateStatusCode(@PathVariable String newstatus, @PathVariable long resolvingId) {
		try {

			incidentResolvingService.updateStatusCode(newstatus, resolvingId);
			return new ResponseEntity<>(HttpStatus.OK);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping(path="/update")
	public IncidentResolvingBean update (@RequestBody IncidentResolvingBean incidentResolvingBean)
	{
		
		IncidentResolvingBean incidentResolvingBean2 = incidentResolvingService.update(incidentResolvingBean);

		
		return incidentResolvingBean2;
	}
	
	@GetMapping(path="/getopenticket")
	public List<IncidentResolvingBean> getOpendeTickets() {
		
		List<IncidentResolvingBean> allOpenEntity = incidentResolvingService.getAllOpenEntity();
		return allOpenEntity;
		
	}
@GetMapping(path = "/getempdept/{id}")
public List<EmployeeBean> getlistOfEmpInDept(@PathVariable long id)
{
	
	List<EmployeeBean> empIncDetails = incidentResolvingService.getEmpIncDetails(id);
	return empIncDetails;
	}
	
}
