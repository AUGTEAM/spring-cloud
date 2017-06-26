package com.liuht;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class CloudConfigApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(CloudConfigApplication.class).web(true).run(args);
	}
}
