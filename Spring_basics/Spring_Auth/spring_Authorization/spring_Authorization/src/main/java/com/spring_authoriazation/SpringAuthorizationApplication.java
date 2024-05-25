package com.spring_authoriazation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringAuthorizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAuthorizationApplication.class, args);
	}

}
