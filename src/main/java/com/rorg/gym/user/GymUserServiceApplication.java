package com.rorg.gym.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

@EntityScan({ "com.rorg.gym.commons.domain.user"
	, "com.rorg.gym.commons.domain.account"
	, "com.rorg.gym.commons.domain.core.rolePolicy" })
public class GymUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymUserServiceApplication.class, args);
	}

}
