package com.supergose.poc.spring.simplecalculator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@RestController
@RefreshScope
@SpringBootApplication
public class SimpleCalculatorApplication {

	private Rating rating;
	@Value("${label:Default label}")
	private String label;

	public static void main(String[] args) {
		SpringApplication.run(SimpleCalculatorApplication.class, args);
	}

	@RequestMapping(value = "/rating")
	public Rating calculateRate() {
		this.rating = new Rating(this.label, 8);
		return this.rating;
	}

}
