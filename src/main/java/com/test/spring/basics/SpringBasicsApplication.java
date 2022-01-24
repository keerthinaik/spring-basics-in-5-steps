package com.test.spring.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringBasicsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		int foundPosition = binarySearch.search(new int[] { 1, 4, 5, 8, 12, 15, 29, 25 }, 12);

		if (foundPosition != -1) {
			System.out.println("found at position " + (foundPosition + 1));
		} else {
			System.out.println("not found!");
		}

	}

}
