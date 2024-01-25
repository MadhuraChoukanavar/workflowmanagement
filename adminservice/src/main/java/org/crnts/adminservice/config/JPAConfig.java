package org.crnts.adminservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
<<<<<<< HEAD
@EnableJpaRepositories(basePackages = { "org.crnts.adminservice" })
@EnableTransactionManagement
public class JPAConfig {
	
=======
<<<<<<< HEAD
@EnableJpaRepositories(basePackages = { "org.crnts.adminservice.bean","org.crnts.adminservice.repository" })
@EnableTransactionManagement
public class JPAConfig {
	
=======
@EnableJpaRepositories(basePackages = { "org.crnts.adminservice" })
@EnableTransactionManagement
public class JPAConfig {
>>>>>>> master

>>>>>>> master
}
