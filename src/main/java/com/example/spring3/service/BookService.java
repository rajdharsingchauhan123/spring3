package com.example.spring3.service;

import com.example.spring3.module.Book;

import java.util.HashSet;

public interface BookService {
    HashSet<Book> findAllBook();
    Book findBookById(long id);

    void addBook(Book b);
    void deleteAllData();
}
