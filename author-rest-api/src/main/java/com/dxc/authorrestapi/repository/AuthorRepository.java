package com.dxc.authorrestapi.repository;

import com.dxc.authorrestapi.model.Author;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer>{
    
}
