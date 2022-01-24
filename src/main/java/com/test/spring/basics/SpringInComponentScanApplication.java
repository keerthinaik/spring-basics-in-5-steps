package com.test.spring.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.test.spring.basicstest.componentscan.ComponentDAO;

@SpringBootApplication
@ComponentScan("com.test.spring.basicstest.componentscan")
public class SpringInComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringInComponentScanApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringInComponentScanApplication.class, args);

		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}", componentDAO);

	}
}