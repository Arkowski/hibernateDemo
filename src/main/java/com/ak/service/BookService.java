package com.ak.service;

import com.ak.entity.Book;

import java.util.Collection;

public interface BookService {

    Collection<Book> getAll();

    Book getById(Long id);

    void deleteById(Long id);

    void add(Book book);

    void update(Book book);
}
