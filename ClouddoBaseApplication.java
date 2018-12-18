package com.bootdo.clouddoCore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan(basePackages = {"com.bootdo.*.dao"})
@ComponentScan(basePackages = { "com.bootdo" })
@SpringBootApplication
public class ClouddoBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClouddoBaseApplication.class, args);
	}
}
