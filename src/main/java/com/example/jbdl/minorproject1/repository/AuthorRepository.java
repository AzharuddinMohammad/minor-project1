package com.example.jbdl.minorproject1.repository;

import com.example.jbdl.minorproject1.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AuthorRepository extends JpaRepository<Author,Integer> {

    //"select a from Author a where a.email=?1"
    @Query("select a from Author a where a.email=:email")
    Author findByEmailId(String email);
}
