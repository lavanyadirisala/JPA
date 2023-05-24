package com.jpa.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.mapping.Entity.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Integer> {
	
		
}
