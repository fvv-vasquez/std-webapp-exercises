package com.fvv.std.dao;

import java.util.List;

import com.fvv.std.bean.Book;
import com.fvv.std.controller.BookController;
import com.fvv.std.controller.BookControllerImpl;
import com.fvv.std.exception.ControllerException;

public class BookTest {

	public static void main(String[] args) {
		try {
			/*book.setTitle("HP 4");
			book.setUnitPrice(48.00);
			book.setPublicationDate(DateUtil.stringToLocalDate("15/07/2017"));*/
			
			BookController controller = new BookControllerImpl();
			controller.listBooks();
			List<Book> books =  controller.listBooks();
					books.forEach(book -> System.out.println("Id: " + book.getId() + " - Title: " + book.getTitle() 
					+ " - Price: " + book.getUnitPrice() + " - Date: " + book.getPublicationDate()));
		} catch (ControllerException e) {
			e.printStackTrace();
		}
		
	}

}
