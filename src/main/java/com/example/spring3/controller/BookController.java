package com.example.spring3.controller;

import com.example.spring3.module.Book;
import com.example.spring3.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;

@RestController
public class BookController {
    @Autowired
     BookServiceImpl bookserviceimpl;

    @PostMapping("/book")
    public void addBook(@RequestBody Book book){
        bookserviceimpl.addBook(book);

    }
    @GetMapping("/findall")
    public HashSet<Book>getAllBook(){
        return bookserviceimpl.findAllBook();
    }

}
