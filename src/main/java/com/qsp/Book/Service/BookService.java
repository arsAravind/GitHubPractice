package com.qsp.Book.Service;

import java.util.List;

import com.qsp.Book.DTO.BookDTO;
import com.qsp.Book.Entity.Book;
import com.qsp.Book.ExceptionHandling.BookNotFoundException;

public interface BookService {



	String saveBook(BookDTO bookDTO);

	List<Book> fetchAll();

	Book fetchOne(int id) throws BookNotFoundException;

	String update(int id, Book book) throws BookNotFoundException;

	String delete(int id) throws BookNotFoundException;

	

}
