package com.example.jbdl.minorproject1.repository;

import com.example.jbdl.minorproject1.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer>{
}
