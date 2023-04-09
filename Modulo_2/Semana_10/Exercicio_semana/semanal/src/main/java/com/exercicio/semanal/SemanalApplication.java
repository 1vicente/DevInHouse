package com.exercicio.semanal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
//exclude = {SecurityAutoConfiguration.class}
@SpringBootApplication()
public class SemanalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SemanalApplication.class, args);
	}

}
