package com.cccsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigBusApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigBusApplication.class, args);
	}

}
