package com.cydeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Spring17RestConsumingApisApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring17RestConsumingApisApplication.class, args);
	}


	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
