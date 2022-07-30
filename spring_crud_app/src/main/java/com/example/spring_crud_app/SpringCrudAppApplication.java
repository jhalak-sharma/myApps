package com.example.spring_crud_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;



@SpringBootApplication
public class SpringCrudAppApplication {

	public static void main(String[] args) {
		
			SpringApplication.run(SpringCrudAppApplication.class, args);
		

	}

}
