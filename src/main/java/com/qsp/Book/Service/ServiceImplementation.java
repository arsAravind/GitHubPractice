package com.qsp.Book.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsp.Book.DTO.BookDTO;
import com.qsp.Book.Entity.Book;
import com.qsp.Book.ExceptionHandling.BookNotFoundException;
import com.qsp.Book.Repository.BookRepository;
@Service
public class ServiceImplementation implements BookService{

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public String saveBook(BookDTO bookDTO) {
		
		Book book=new Book();
		book.setBookId(0);
		book.setBookName(bookDTO.getBookName());
		book.setBookAuthor(bookDTO.getBookAuthor());
		book.setBookPrice(bookDTO.getBookPrice());
		
		bookRepository.save(book);
		return "Book is saved in DB";
	}

	@Override
	public List<Book> fetchAll() {
		
		List<Book> findAll = bookRepository.findAll();
		
		return findAll;
	}

	@Override
	public Book fetchOne(int id) throws BookNotFoundException {
		
		Book b = bookRepository.findById(id).orElse(null);
		if(b!=null)
		{
			return b;
		}
		
		else
		{
			throw new ArithmeticException();
		}
		//			throw new BookNotFoundException();

		
	}

	@Override
	public String update(int id, Book book) throws BookNotFoundException {
		
		Book b = bookRepository.findById(id).orElse(null);
		
		if(b==null)
		{
			throw new BookNotFoundException();
		}
		b.setBookName(book.getBookName());
		b.setBookAuthor(book.getBookAuthor());
		b.setBookPrice(book.getBookPrice());

		bookRepository.save(b);
		
		return "Update Successfull";
	}

	@Override
	public String delete(int id) throws BookNotFoundException {
		
		Book b = bookRepository.findById(id).orElse(null);
		if(b==null)
		{
			throw new BookNotFoundException();
		}
		
		bookRepository.delete(b);
		return "Deleted !";
	}

}
