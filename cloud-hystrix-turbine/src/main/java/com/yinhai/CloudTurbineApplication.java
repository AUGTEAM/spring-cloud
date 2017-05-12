package com.yinhai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

// 启动一个EurekaServer
@EnableEurekaServer
@SpringBootApplication
public class CloudTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudTurbineApplication.class, args);
	}
}
