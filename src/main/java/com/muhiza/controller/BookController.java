package com.muhiza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muhiza.model.Book;
import com.muhiza.services.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	//hfjvjvjvjvjvjv
	//jbjbjbjbjb
	@GetMapping("/api/books")
	public ResponseEntity<List<Book>> list(){
		
		List<Book> list = bookService.list();
		return ResponseEntity.ok().body(list); 
	}

}
