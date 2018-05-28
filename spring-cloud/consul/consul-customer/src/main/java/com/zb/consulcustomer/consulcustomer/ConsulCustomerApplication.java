package com.zb.consulcustomer.consulcustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConsulCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsulCustomerApplication.class, args);
	}
}
