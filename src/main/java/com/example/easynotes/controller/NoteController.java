package com.example.easynotes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.easynotes.model.Note;
import com.example.easynotes.repository.NoteRepository;

@RestController // combination of @Controller + @ResponseBody
// @Controller : used to define a controller
// @ResponseBody : used to indicate that the return value of a method should be used as a response body of the request.
@RequestMapping ("/api") // declare the URL for all the APIs in this controller will start with /api.
public class NoteController {

	@Autowired
	NoteRepository noteRepository;
	
	// Get All Notes
	@GetMapping ("/notes")
	public List <Note> getAllNotes(){
		return noteRepository.findAll(); //call JPA Repo method.
	}
	
	// Create a new Note
	
	// Get a Single Note
	
	// Update a Note
	
	// Delete a Note
	
	
}
