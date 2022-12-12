package com.onetoone.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResourceAccessException;

import com.onetoone.exception.ResourceNotFoundException;
import com.onetoone.model.Book;
import com.onetoone.repository.BookRepository;
import com.onetoone.service.BookService;
@Component
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository bookRepository;

	public BookServiceImpl(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	@Override
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAllBook() {
		return bookRepository.findAll();
	}

	@Override
	public Book getBookId(long id) {
		return bookRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Book","Id",id));
	}

	@Override
	public Book updateBook(Book book, long id) {
		Book a1 = bookRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Book","Id",id));
		a1.setAuthor(book.getAuthor());
		a1.setTittle(book.getTittle());
		bookRepository.save(a1);
		
		return a1;
	}

	@Override
	public void deleteBook(long id) {
		bookRepository.deleteById(id);
		bookRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Book","Id",id));
		
	}

	
	
	
	
}
