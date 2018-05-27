package com.fvv.std.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fvv.std.bean.User;
import com.fvv.std.controller.LoginController;
import com.fvv.std.controller.LoginControllerImpl;

/**
 * 
 * 
 * @author Fatima Vasquez
 * <p>Created on 2018</p>
 * @version 1.0 	
 *
 */
public class AuthServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private LoginController loginController;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.loginController = new LoginControllerImpl();
		super.init(config);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("HTTP GET Invoked...");	
		this.validateUser(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("HTTP POST Invoked...");
		this.validateUser(request, response);
	}
	
	private void validateUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		User user = new User();
		user.setName(name);
		user.setPassword(password);
		
		out.println("<html>");
		out.println("<body>");
		
		if (this.loginController.validateLogin(user)) {
			out.println("Name/Password Match");
		} else {
			out.println("Name/Password Does Not Match");
		}		
		
		out.println("<br/><a href=\"index.jsp\">Home</a>");
		out.println("</body>");
		out.println("</html>");
	}
}
