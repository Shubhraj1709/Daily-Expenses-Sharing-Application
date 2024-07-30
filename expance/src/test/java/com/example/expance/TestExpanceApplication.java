package com.example.expance;

import org.springframework.boot.SpringApplication;

public class TestExpanceApplication {

	public static void main(String[] args) {
		SpringApplication.from(ExpanceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
