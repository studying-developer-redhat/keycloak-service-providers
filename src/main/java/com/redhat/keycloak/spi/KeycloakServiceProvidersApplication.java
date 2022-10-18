package com.redhat.keycloak.spi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KeycloakServiceProvidersApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeycloakServiceProvidersApplication.class, args);
	}

}
