package com.liuht;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
//@EnableDiscoveryClient
@SpringBootApplication
// 扫描servle 以及 listener
@ServletComponentScan
public class CloudTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudTurbineApplication.class, args);
	}
}
