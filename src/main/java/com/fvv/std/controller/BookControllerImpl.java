package com.fvv.std.controller;

import java.util.List;

import com.fvv.std.bean.Book;
import com.fvv.std.dao.BookDAO;
import com.fvv.std.dao.BookDAOImpl;
import com.fvv.std.exception.BookValidationException;
import com.fvv.std.exception.ControllerException;
import com.fvv.std.exception.DaoException;
import com.fvv.std.util.Constants;

/**
 * Controller class for a Book object.
 * 
 * @author Fatima Vasquez
 * <p>Created on 2018</p>	
 * @version 1.0 	
 *
 */
public class BookControllerImpl implements BookController {
	
	private final BookDAO bookDao;
	
	/**
	 * Class constructor instantiating a new BookDAOImpl object.
	 */
	public BookControllerImpl() {
		this.bookDao = new BookDAOImpl(); 
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void addBook(final Book book) throws BookValidationException, ControllerException {
		try {
			this.validateBook(book);
			this.bookDao.addBook(book);
		} catch (DaoException e) {
			throw new ControllerException("Error to add a book", e);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Book> listBooks() throws ControllerException {
		try {
			return this.bookDao.listBooks();
		} catch (DaoException e) {
			throw new ControllerException("Error to load the list", e);
		}
	}

	/**
	 * Validate if a field is empty.
	 * 
	 * @param book of type Book
	 * @throws BookValidationException if a field is empty.
	 */
	private void validateBook(final Book book) throws BookValidationException {
		StringBuilder sb = new StringBuilder();
		if(book.getTitle().equals("")) {
			sb.append("Field title cannot be empty.").append(Constants.LINE_SEPARATOR);
		}
		if(book.getUnitPrice() <= 0) {
			sb.append("Field price cannot be smaller than 0.").append(Constants.LINE_SEPARATOR);
		}
		if(sb.length() > 0) {
			throw new BookValidationException(sb.toString());
		}
	}
}
