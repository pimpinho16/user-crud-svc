package com.service;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@ImportResource("classpath:spring-config.xml")
public class UserCrudSvcApplication {

	public static void main(String[] args) {
		try {
			System.setProperty("hostname",InetAddress.getLocalHost().getHostName());
			SpringApplication.run(UserCrudSvcApplication.class, args);
		}catch(UnknownHostException e) {
			//log.error("",e);
		}
		
		
		
	}

}
