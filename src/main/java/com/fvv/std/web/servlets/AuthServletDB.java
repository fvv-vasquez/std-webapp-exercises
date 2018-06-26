package com.fvv.std.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fvv.std.bean.UserDB;
import com.fvv.std.controller.UserDbController;
import com.fvv.std.controller.UserDbControllerImpl;
import com.fvv.std.exception.ControllerException;

public class AuthServletDB extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private UserDbController userDbController;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.userDbController = new UserDbControllerImpl();
		super.init(config);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.validateUser(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.validateUser(request, response);
	}
	
	private void validateUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		UserDB userDB = new UserDB();
		userDB.setName(name);
		userDB.setPassword(password);
		
		out.println("<html>");
		out.println("<body>");
		
		try {
			if (this.userDbController.checkLogin(userDB)) {
				out.println("Name/Password Match");
			} else {
				out.println("Name/Password Does Not Match");
			}
		} catch (ControllerException e) {
			e.printStackTrace();
			request.setAttribute("resultMsg", "Error: " + e.getMessage());
		}		
		
		out.println("<br/><a href=\"../index.jsp\">Home</a>");
		out.println("</body>");
		out.println("</html>");
	}
}
