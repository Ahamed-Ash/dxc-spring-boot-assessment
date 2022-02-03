package com.dxc.authorrestapi.services;

import java.util.List;

import com.dxc.authorrestapi.model.Author;

public interface AuthorService {

    public Author getAuthorById(int id);

    public Author createAuthor(Author author);

    public Author updateAuthor(Author author);

    public void deleteAuthor(int id);

    public List<Author> findAllAuthor();
    
}
