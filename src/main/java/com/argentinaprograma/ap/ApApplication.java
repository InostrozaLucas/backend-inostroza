package com.argentinaprograma.ap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@SpringBootApplication
public class ApApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApApplication.class, args);
	}
	@Bean
	public CorsFilter corsFilter() {
		CorsConfiguration corsConfiguration= new CorsConfiguration();
		corsConfiguration.setAllowCredentials(true);
		corsConfiguration.setAllowedOrigins(Arrays.asList("https://login-lucasinostroza.web.app/"));
		corsConfiguration.setAllowedHeaders(Arrays.asList("X-Requested-With", "Origin", "Content-Type", "Accept",
				"Authorization","Access-Control-Allow-Origin","Origin,Accept","Access-Control-Requested-Method","Access-Control-Requested-Headers"));
		corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type","Accept","Authorization","Access-Control-Allow-Origin",
				"Access-Control-Allow-Origin","Access-Control-Requested-Headers"));
		corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "OPTIONS", "DELETE", "PUT"));
		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
		return new CorsFilter(urlBasedCorsConfigurationSource);
	}

}
