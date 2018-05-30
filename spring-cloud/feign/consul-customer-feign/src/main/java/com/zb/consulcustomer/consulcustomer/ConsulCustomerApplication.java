package com.zb.consulcustomer.consulcustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 创建人：张博【zhangb@lianliantech.cn】
 * 时间：2018/5/29 上午11:50
 * EnableFeignClients 注解用来扫描使用 FeignClients 注解定义的接口
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class ConsulCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsulCustomerApplication.class, args);
	}
}
