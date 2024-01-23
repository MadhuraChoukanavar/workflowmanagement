package org.crnts.ticketingservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = { "org.crnts.ticketingservice" })
@EnableTransactionManagement
public class JPAConfig {
	

}
