package com.liuht;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

// 启动一个EurekaServer
@EnableEurekaServer
@SpringBootApplication
public class CloudRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudRegistryApplication.class, args);
	}
}
