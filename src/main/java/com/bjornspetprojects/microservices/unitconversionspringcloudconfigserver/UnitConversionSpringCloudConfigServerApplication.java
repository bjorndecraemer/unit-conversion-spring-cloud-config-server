package com.bjornspetprojects.microservices.unitconversionspringcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class UnitConversionSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnitConversionSpringCloudConfigServerApplication.class, args);
	}

}

