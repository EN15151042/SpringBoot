package com.onetoone.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onetoone.model.Book;
import com.onetoone.service.BookService;

@RestController
@RequestMapping("/api/book")
public class BookController {

	private BookService bookService;

	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}
	
	@PostMapping
	ResponseEntity<Book> saveBook(@RequestBody Book book)
	{
		return new ResponseEntity<Book>(bookService.saveBook(book),HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Book> getallBook()
	{
		return bookService.getAllBook();
	}
	
	@GetMapping("{id}")
	ResponseEntity<Book> getBookid(@PathVariable("id") long id)
	{
		return new ResponseEntity<Book>(bookService.getBookId(id),HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	ResponseEntity<Book> updateBook(@PathVariable("id") long id,@RequestBody Book book)
	{
		return new ResponseEntity<Book>(bookService.updateBook(book,id),HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	ResponseEntity<String> deleteid(@PathVariable("id")long id)
	{
		bookService.deleteBook(id);
		return new ResponseEntity<String>("Delete Susceed",HttpStatus.OK);
	}
	
	
}
