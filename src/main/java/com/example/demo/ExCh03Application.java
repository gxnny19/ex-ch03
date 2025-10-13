package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExCh03Application {

	public static void main(String[] args) {
		SpringApplication.run(ExCh03Application.class, args);
		int number = 1;
		if (number == 1) {
			System.out.println("if 블록입니다.");
		} else if (number == 2) {
			System.out.println("else if 블록입니다.");
		} else {
			System.out.println("else 블록입니다.");
		}
	}

}
