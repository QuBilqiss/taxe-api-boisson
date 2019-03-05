package com.sir.Taxe_Boisson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.sir.Taxe_Boisson.rest")
public class TaxeBoissonApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxeBoissonApplication.class, args);
	}

}

