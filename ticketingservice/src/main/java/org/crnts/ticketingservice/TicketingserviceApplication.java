package org.crnts.ticketingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicketingserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketingserviceApplication.class, args);
		System.out.println("it configured");
	}

}
