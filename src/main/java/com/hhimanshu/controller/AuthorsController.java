package com.hhimanshu.controller;

import com.hhimanshu.entities.Author;
import com.hhimanshu.repositories.AuthorRepository;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/authors")
public class AuthorsController {

  private AuthorRepository authorRepository;

  @Autowired
  public AuthorsController(AuthorRepository authorRepository) {
    this.authorRepository = authorRepository;
  }

  public Stream<Author> getAllAuthors() {
    return StreamSupport.stream(authorRepository.findAll().spliterator(), true);
  }
}
