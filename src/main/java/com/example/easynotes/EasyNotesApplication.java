//https://www.callicoder.com/spring-boot-rest-api-tutorial-with-mysql-jpa-hibernate/
package com.example.easynotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // --> @Configuration + @EnableAutoConfiguration + @ComponentScan 
public class EasyNotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyNotesApplication.class, args);
	}

}
