package de.client.ProjectClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;

@SpringBootApplication
public class ProjectClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectClientApplication.class, args);
	}

	@Bean
	public RestClient restClient(){
		return RestClient.create("http://localhost:8080/");
	}
}