package com.UST.SpringBootWithFeignClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootWithFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithFeignClientApplication.class, args);
	}

}
