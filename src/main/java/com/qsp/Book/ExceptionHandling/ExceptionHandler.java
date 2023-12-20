package com.qsp.Book.ExceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {

	@org.springframework.web.bind.annotation.ExceptionHandler(value = BookNotFoundException.class)
	public ResponseEntity<Object> exceptionHandler(BookNotFoundException b)
	{
		return new ResponseEntity<>(b.getMessage(),HttpStatus.NOT_FOUND);
	}
}
