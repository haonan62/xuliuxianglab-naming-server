package com.xuliuxianglab.forex.portal.namingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
public class NamingserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(NamingserverApplication.class, args);
	}

}
