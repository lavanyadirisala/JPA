package com.jpa.mapping.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.jpa.mapping.Entity.Library;
import com.jpa.mapping.Entity.Student;
import com.jpa.mapping.repository.LibraryRepository;
import com.jpa.mapping.repository.StudentRepository;
import com.jpa.mapping.services.MappingServices;

@RestController
@RequestMapping("/mapping")
public class MappingController {
	@Autowired
	MappingServices service;

	@PostMapping("/student")
	private void getStudents(@RequestBody Student student) {
		service.createObjects(student);
	}

	@GetMapping("/getbooks/{book_id}")
	private Library getBooks(@PathVariable("book_id") int bookid) {
		return service.getbooks(bookid);

	}

	@DeleteMapping("/student/{s_id}")
	private void deleteBook(@PathVariable("s_id") int studId) {

		service.delete(studId);
	}
}
