package com.ak.dao;

import com.ak.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository <Book, Long> {
}
