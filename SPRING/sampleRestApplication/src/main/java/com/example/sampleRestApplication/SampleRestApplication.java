package com.example.sampleRestApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
@EnableDiscoveryClient
@RibbonClient(name = "EurekaServerApplication", configuration = RibbonConfiguration.class)
public class SampleRestApplication {

	public static void main(String[] args) {

		SpringApplication.run(SampleRestApplication.class, args);

	}

}
