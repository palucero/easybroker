package com.pdlucero.easybroker.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EasybrokerClientApplication {

	public static void main( String[] args ) {
		SpringApplication.run( EasybrokerClientApplication.class, args );
	}

}
