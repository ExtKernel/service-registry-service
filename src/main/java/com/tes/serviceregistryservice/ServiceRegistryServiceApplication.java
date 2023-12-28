package com.tes.serviceregistryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableCaching
@EnableEurekaServer
@SpringBootApplication
public class ServiceRegistryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryServiceApplication.class, args);
	}

}
