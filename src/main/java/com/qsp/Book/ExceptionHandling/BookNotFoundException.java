package com.qsp.Book.ExceptionHandling;

public class BookNotFoundException extends Exception{
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return  "Book Not Found.. Please check the ID";
	}



}
