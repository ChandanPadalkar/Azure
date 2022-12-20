package com.ckp.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleWebAppApplication.class, args);
	}

	@GetMapping("/message")
	public String getMessage()
	{
		return "Sample web application for Azure";
	}

}
