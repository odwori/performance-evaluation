package com.muhiza.dao;

import java.util.List;

import com.muhiza.model.Book;

public interface BookDAO {
// save the record
	long save(Book book);
	
	// get a single record
	Book get(long id);
	
	// get all books records
	List<Book> list();
	
	
	//update a book
	void update(long id, Book book);
	
	// deleting a book
	void delete(long id);
}
