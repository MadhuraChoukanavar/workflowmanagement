package org.crnts.adminservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
<<<<<<< HEAD

=======
<<<<<<< HEAD
@EnableJpaRepositories(basePackages = { "org.crnts.adminservice" })
@EnableTransactionManagement
public class JPAConfig {
	
=======
<<<<<<< HEAD
>>>>>>> 9d687de0c72751f053a8c9de180ae79bb8ce3e02
@EnableJpaRepositories(basePackages = { "org.crnts.adminservice.bean","org.crnts.adminservice.repository" })
@EnableTransactionManagement
public class JPAConfig {
	



>>>>>>> master
}
