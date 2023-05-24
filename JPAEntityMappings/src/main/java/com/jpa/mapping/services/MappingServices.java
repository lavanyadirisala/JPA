package com.jpa.mapping.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jpa.mapping.Entity.Library;
import com.jpa.mapping.Entity.Student;
import com.jpa.mapping.repository.LibraryRepository;
import com.jpa.mapping.repository.StudentRepository;

@Service
public class MappingServices {

	@Autowired
	StudentRepository studrepo;
	@Autowired
	LibraryRepository librepo;

	public void createObjects(Student s) {
		studrepo.save(s);
	}

	public void delete(int studId) {
		System.out.print("In service");
		studrepo.deleteById(studId);
	}


	public Library getbooks(int id) {

		return librepo.findById(id).get();

	}

}
