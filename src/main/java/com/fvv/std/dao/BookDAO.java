package com.fvv.std.dao;

import java.util.List;

import com.fvv.std.bean.Book;
import com.fvv.std.exception.DaoException;

/**
 * DAO Interface of a Book object, with main database operations.
 * 
 * @author Fatima Vasquez
 * <p>Created on 2018</p>	
 * @version 1.0 	
 *
 */
public interface BookDAO {

	/**
	 * Add a book at the bookstore in the database.
	 * 
	 * @param book of Book type.
	 * @throws DaoException when a problem in database happens.
	 */
	void addBook(final Book book) throws DaoException;

	/**
	 * Lists all books in the database.
	 * 
	 * @return a list of books.
	 * @throws DaoException when a problem in database happens.
	 */
	List<Book> listBooks() throws DaoException;
}
