package com.nask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
@SpringBootApplication //Shaka é o melhor cavaleiro de ouro
public class PortalMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortalMainApplication.class, args);
	}

}
