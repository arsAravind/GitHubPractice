package com.qsp.Book.DTO;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {
	
	private String bookName;

	private String bookAuthor;

	private String bookPrice;

}
