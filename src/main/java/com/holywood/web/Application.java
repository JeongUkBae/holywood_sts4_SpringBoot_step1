package com.holywood.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.holywood.web.mapper.MemberMapper;

@SpringBootApplication
@EnableAutoConfiguration
public class Application {
	@Autowired MemberMapper mapper;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	
	}	
}
