package com.liuht;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudProviderApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(CloudProviderApplication.class).web(true).run(args);
	}
}
