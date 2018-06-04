package com.fvv.std.controller;

import java.util.List;

import com.fvv.std.bean.Book;
import com.fvv.std.exception.BookValidationException;
import com.fvv.std.exception.ControllerException;

/**
 * Controller interface for a Book object.
 * 
 * @author Fatima Vasquez
 * <p>Created on 2018</p>	
 * @version 1.0 	
 *
 */
public interface BookController {
	
	/**
	 * Add a book using DAO.
	 * 
	 * @param book of Book type.
	 * @throws ControllerException when a problem in controller happens.
	 * @throws BookValidationException when a field is empty.
	 */
	void addBook(final Book book) throws BookValidationException, ControllerException;
	
	/**
	 * Lists all books using DAO.
	 * 
	 * @return a list of books.
	 * @throws ControllerException when a problem in controller happens.
	 */
	List<Book> listBooks() throws ControllerException;
}
