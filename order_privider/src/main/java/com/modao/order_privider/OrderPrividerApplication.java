package com.modao.order_privider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OrderPrividerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderPrividerApplication.class, args);
	}
}
