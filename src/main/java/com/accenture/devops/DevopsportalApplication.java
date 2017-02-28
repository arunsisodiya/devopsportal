package com.accenture.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@SpringBootApplication
@EnableJpaRepositories
@Import(RepositoryRestMvcConfiguration.class)
public class DevopsportalApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(DevopsportalApplication.class, args);
	}
}
