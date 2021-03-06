//https://www.callicoder.com/spring-boot-rest-api-tutorial-with-mysql-jpa-hibernate/
package com.example.easynotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication // --> @Configuration + @EnableAutoConfiguration + @ComponentScan 
@EnableJpaAuditing //To enable JPA Auditing -- add this here + add respective listener to Notes class.
public class EasyNotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyNotesApplication.class, args);
	}

}
