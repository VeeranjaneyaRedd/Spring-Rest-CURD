package com.slokm.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
@SpringBootApplication
@EnableJpaRepositories
public class SpringbootRestMysqlAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestMysqlAppApplication.class, args);
	}

}
