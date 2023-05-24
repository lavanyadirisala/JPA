package com.JPA.CriteriaQueries;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.JPA.CriteriaQueries.entity.StudentEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
@SpringBootApplication
public class ApplicationProgram {
	
	public static void main(String args[]) {
		SpringApplication.run(ApplicationProgram.class, args);
		
	}
}
