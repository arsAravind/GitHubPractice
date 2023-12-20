package com.qsp.Book.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.Book.DTO.BookDTO;
import com.qsp.Book.Entity.Book;
import com.qsp.Book.ExceptionHandling.BookNotFoundException;
import com.qsp.Book.Service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService service;

	@PostMapping("/save")
	public String bookSave(@RequestBody BookDTO bookDTO) {
		String s = service.saveBook(bookDTO);
		return s;
	}

	@GetMapping("/fetchAll")
	public List<Book> fetchAll() {
	
		List<Book> book=service.fetchAll();
		return book;
	}
	
	@GetMapping("/fetchOne/{id}")
	public Book fetchOne(@PathVariable int id) throws BookNotFoundException
	{
		Book book=service.fetchOne(id);
		return book;
	}
	
	@PutMapping("/update/{id}")
	public String update(@PathVariable int id,@RequestBody Book book) throws BookNotFoundException
	{
	String s=service.update(id,book);
	return s;
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) throws BookNotFoundException
	{
		String s=service.delete(id);
		return s;
	}
}
