package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@EnableWebMvc
@SpringBootApplication
public class MyEmpSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyEmpSystemApplication.class, args);
	}

}
