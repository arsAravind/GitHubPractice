package com.qsp.Book.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Book_Id")
	private int bookId;
	@Column(name = "Book_Name")
	private String bookName;
	@Column(name = "Book_Author")
	private String bookAuthor;
	@Column(name = "Book_Price")
	private String bookPrice;

}
