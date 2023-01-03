package com.guli.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * PmsApplication
 *
 * @author Runhu-Wu
 * @date 2022/12/12
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.guli.product.mapper")
public class ProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}

}
