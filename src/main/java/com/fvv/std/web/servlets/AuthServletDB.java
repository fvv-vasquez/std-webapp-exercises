package com.fvv.std.web.servlets;

import java.io.IOException;

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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.validateUser(request, response);
	}
	
	private void validateUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			String name = request.getParameter("name");
			String password = request.getParameter("password");
			
			UserDB userDB = new UserDB();
			userDB.setName(name);
			userDB.setPassword(password);
			
			if (this.userDbController.checkLogin(userDB)) {
				request.getSession().setAttribute("loggedUser", name);
				response.sendRedirect("/std-webapp-exercises/03-filter/home-page.jsp");
			} else {
				response.sendRedirect("/std-webapp-exercises/03-filter/invalid-login.jsp");
			}
			
			if(this.userDbController.checkPermission(userDB).equals("admin")) {
				
			}
		} catch (ControllerException e) {
			e.printStackTrace();
			request.setAttribute("resultMsg", "Error: " + e.getMessage());
			response.sendRedirect("../error.jsp");			
		}
	}
}
