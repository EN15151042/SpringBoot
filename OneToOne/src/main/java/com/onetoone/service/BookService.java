package com.onetoone.service;

import java.util.List;

import com.onetoone.model.Book;



public interface BookService {

	Book saveBook(Book book);
	List<Book> getAllBook();
	Book getBookId(long id);
	Book updateBook(Book book,long id);
	void deleteBook(long id);
	
	
}
