package com.fvv.std.web.servlets;

import java.io.IOException;
import java.time.format.DateTimeParseException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fvv.std.bean.Book;
import com.fvv.std.exception.ViewException;
import com.fvv.std.util.DateUtil;
import com.fvv.std.web.view.BookView;

public class AddBookServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private BookView bookView;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.bookView = new BookView();
		super.init(config);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HTTP POST Invoked...");
		this.addBook(request, response);
	}
	
	private void addBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;
		
		try {		
			String title = request.getParameter("title");
			String unitPrice = request.getParameter("unitPrice");
			String publicationDate = request.getParameter("publicationDate");
		
			Book book = new Book();
			book.setTitle(title);
			book.setUnitPrice(Double.parseDouble(unitPrice));
			book.setPublicationDate(DateUtil.stringToLocalDate(publicationDate));
			bookView.addBook(book);
			
			request.setAttribute("resultMsg", "Book " + book.getTitle() + " added properly in DB");
			rd = request.getRequestDispatcher("/success.jsp");
		} catch (NumberFormatException | DateTimeParseException | ViewException e) {
			e.printStackTrace();
			request.setAttribute("resultMsg", "Error: " + e.getMessage());
			rd = request.getRequestDispatcher("/error.jsp");
		}
		request.setAttribute("returnPage", "../02-taglib/add-book.jsp");
		rd.forward(request, response);
	}
}
