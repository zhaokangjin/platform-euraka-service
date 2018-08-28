package com.platflat.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@SpringBootApplication
//@EnableTransactionManagement
//@ComponentScan(basePackages={"com.platflat.eureka.server"})
//@MapperScan("com.platflat.eureka.server.dao")
//@EnableCaching
@EnableEurekaServer
public class PlatformEurakaServerApp {
	public static void main(String[] args) {
		SpringApplication.run(PlatformEurakaServerApp.class, args);
	}
}
