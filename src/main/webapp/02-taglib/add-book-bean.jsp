<%@page import="com.fvv.std.exception.ViewException"%>
<%@page import="com.fvv.std.util.DateUtil"%>
<%@page import="com.fvv.std.bean.Book"%>
<%@page import="com.fvv.std.exception.ViewException"%>
<%@page import="java.time.format.DateTimeParseException"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:useBean id="bookView" class="com.fvv.std.web.view.BookView"/>
<jsp:useBean id="bookDto" class="com.fvv.std.web.dto.BookDto"/>
<jsp:setProperty property="*" name="bookDto"/>

<%
	RequestDispatcher rd;
	
	try {
		Book book = new Book();
		book.setTitle(bookDto.getTitle());
		book.setUnitPrice(Double.parseDouble(bookDto.getUnitPrice()));
		book.setPublicationDate(DateUtil.stringToLocalDate(bookDto.getPublicationDate()));
		bookView.addBook(book);
		
		request.setAttribute("resultMsg", "Book " + book.getTitle() + " added properly in DB");
		rd = request.getRequestDispatcher("/success.jsp");		
	} catch (NumberFormatException | DateTimeParseException | ViewException e) {
		e.printStackTrace();
		request.setAttribute("resultMsg", "Error: " + e.getMessage());
		rd = request.getRequestDispatcher("/error.jsp");
	}
	request.setAttribute("returnPage", "../02-taglib/add-book-no-servlet.jsp");
	rd.forward(request, response);
%>