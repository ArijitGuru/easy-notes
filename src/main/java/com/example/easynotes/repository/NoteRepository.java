package com.example.easynotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.easynotes.model.Note;

@Repository // Tell Spring to bootstrap the repository during component scan
public interface NoteRepository extends JpaRepository<Note, Long>{

	//We will now be able to use JpaRepository’s methods like 
	//save(), findOne(), findAll(), count(), delete() etc.
	//We don’t need to implement these methods. 
	//They are already implemented by Spring Data JPA’s SimpleJpaRepository. 
	//This implementation is plugged in by Spring automatically at runtime.
	//check all available methods here: 
	//https://docs.spring.io/autorepo/docs/spring-data-jpa/current/api/org/springframework/data/jpa/repository/support/SimpleJpaRepository.html
	//Spring Data JPA has a bunch of other interesting features like Query methods 
	//(dynamically creating queries based on method names), Criteria API, 
	//Specifications, QueryDsl etc.

}
