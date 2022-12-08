package com.restshop.restshop;

import com.restshop.restshop.security.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class RestShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestShopApplication.class, args);
	}

}
