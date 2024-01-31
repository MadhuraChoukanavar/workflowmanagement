package org.crnts.adminservice.config;

import org.springframework.context.annotation.Bean;

<<<<<<< HEAD
import org.springframework.context.annotation.Configuration;
<<<<<<< HEAD

=======
>>>>>>> master
=======

import org.springframework.context.annotation.Configuration;

>>>>>>> 61ce05bf8ead2e048ff3b007c582699371c8696d
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AdminConfig {
<<<<<<< HEAD
	@Bean
=======

	@Bean 
<<<<<<< HEAD
>>>>>>> master
=======

>>>>>>> 61ce05bf8ead2e048ff3b007c582699371c8696d
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
