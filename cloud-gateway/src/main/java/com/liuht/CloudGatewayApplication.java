package com.liuht;

import com.liuht.filter.AccessFilter;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
// @SpringCloudApplication 包含了@SpringBootApplication、@EnableDiscoveryClient、@EnableCircuitBreaker
@SpringCloudApplication
public class CloudGatewayApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(CloudGatewayApplication.class).web(true).run(args);
	}

	@Bean
	public AccessFilter accessFilter(){
		return new AccessFilter();
	}
}
