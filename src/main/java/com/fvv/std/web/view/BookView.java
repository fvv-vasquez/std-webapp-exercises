package com.fvv.std.web.view;

import java.util.List;

import com.fvv.std.bean.Book;
import com.fvv.std.controller.BookController;
import com.fvv.std.controller.BookControllerImpl;
import com.fvv.std.exception.BookValidationException;
import com.fvv.std.exception.ControllerException;
import com.fvv.std.exception.ViewException;

public class BookView {
	
	private BookController bookController;
	
	public BookView() {
		this.bookController = new BookControllerImpl();
	}
	
	public void addBook(final Book book) throws ViewException {
		try {
			this.bookController.addBook(book);
		} catch (BookValidationException | ControllerException e) {
			throw new ViewException("Error to add a book", e);
		}
	}
	
	public List<Book> getBooks() throws ControllerException {
		return this.bookController.listBooks();
	}

}
