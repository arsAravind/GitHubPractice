package com.qsp.Book.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qsp.Book.Entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
