package com.ayush.opein_feign_prac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OpeinFeignPracApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpeinFeignPracApplication.class, args);
	}

}
