package com.example.swagger_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableDiscoveryClient
@SpringBootApplication
public class EurikaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurikaServerApplication.class, args);
	}

}
