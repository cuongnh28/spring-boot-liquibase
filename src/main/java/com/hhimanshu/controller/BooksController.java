package com.hhimanshu.controller;

import com.hhimanshu.entities.Book;
import com.hhimanshu.repositories.BookRepository;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import com.hhimanshu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class BooksController {

  @Autowired
  private BookService bookService;

  @GetMapping
  public List<Book> getAllBooks() {
    return bookService.getBooks();
  }
}
