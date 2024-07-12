package com.think.rest_demos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestDemosApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestDemosApplication.class, args);
	}

	  @Bean
	    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer() {
	        return factory -> factory.setPort(8081);
	    }
	}

