package com.liuht;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudConfigClientApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(CloudConfigClientApplication.class).web(true).run(args);
	}
}
