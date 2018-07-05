package com.fvv.std.filter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fvv.std.bean.UserDB;
import com.fvv.std.controller.UserDbController;
import com.fvv.std.controller.UserDbControllerImpl;
import com.fvv.std.exception.ControllerException;

public class AuthFilter implements Filter {
	
	UserDbController userDbController;

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		final HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		final HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		
		final Object loggedUser = httpServletRequest.getSession().getAttribute("loggedUser");
		
		if(loggedUser != null) {
			final String username = loggedUser.toString();
			System.out.println(username);
			
			String permission;
			try {
				UserDB userDB = new UserDB();
				userDB.setName(username);
				
				permission = this.userDbController.checkPermission((userDB));
				
				String path = ((HttpServletRequest) request).getRequestURI().substring(((HttpServletRequest) request)
						.getContextPath().length());
				
				boolean validation = this.validateUriAccessByPermission(permission, path);
				
				if (validation == true) {
					chain.doFilter(request, response);
				} else {
					httpServletResponse.sendRedirect("/std-webapp-exercises/03-filter/no-permission.jsp");
				}
				
				/*if (permission.equals("admin") && path.equals("/03-filter/page-one.jsp") 
						|| (permission.equals("admin") && path.equals("/03-filter/page-two.jsp")) 
						|| (permission.equals("admin") && path.equals("/03-filter/page-three.jsp"))) {
					chain.doFilter(request, response);
				} else if (permission.equals("user") && path.equals("/03-filter/page-one.jsp")) {
					chain.doFilter(request, response);
				} else {
					httpServletResponse.sendRedirect("/std-webapp-exercises/03-filter/no-permission.jsp");
				}*/
				
			} catch (ControllerException e) {
				e.printStackTrace();  
			}
		} else {
			httpServletResponse.sendRedirect("/std-webapp-exercises/03-filter/loginDB.jsp");
		}		
	}
	
	private boolean validateUriAccessByPermission(final String permission, final String uri) {
		Map<String, String[]> permissionMap = new HashMap<>();
		return false;
		
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		userDbController = new UserDbControllerImpl();
	}

}
