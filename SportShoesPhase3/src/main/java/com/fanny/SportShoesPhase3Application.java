package com.fanny;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SportShoesPhase3Application {

	public static void main(String[] args) {
		SpringApplication.run(SportShoesPhase3Application.class, args);
	}

}
