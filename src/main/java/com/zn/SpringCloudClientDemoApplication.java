package com.zn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudClientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudClientDemoApplication.class, args);
	}
}
