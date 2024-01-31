package org.crnts.adminservice.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
<<<<<<< HEAD

=======
>>>>>>> master
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AdminConfig {
<<<<<<< HEAD
	@Bean
=======

	@Bean 
>>>>>>> master
	public WebMvcConfigurer mvcConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedHeaders("*").allowedMethods("*")
						.allowedOrigins("*");
			}
		};
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
