package com.liyl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: 李毅霖.
 * @Description:
 * @Date: 2017/12/24
 * @Modified by .
 */
@SpringBootApplication
@EnableEurekaServer

public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
