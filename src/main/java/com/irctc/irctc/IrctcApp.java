package com.irctc.irctc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan(basePackages = "com.irctc.irctc")
@SpringBootApplication
@EntityScan("com.irctc.irctc.entity")
@EnableJpaRepositories
public class IrctcApp {

	public static void main(String[] args) {
		SpringApplication.run(IrctcApp.class, args);
	}

}
