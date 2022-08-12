package tn.bfi.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class ReferentielApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReferentielApplication.class, args);
	}

}
