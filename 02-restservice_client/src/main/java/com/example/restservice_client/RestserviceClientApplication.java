package com.example.restservice_client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestserviceClientApplication {

	private static final Logger log = LoggerFactory.getLogger(RestserviceClientApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RestserviceClientApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Item item = restTemplate.getForObject("https://api.mercadolibre.com/items/MLM1447798739", Item.class);
			log.info(item.toString());
		};
	}

}
