package com.jpa.mapping.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.mapping.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
