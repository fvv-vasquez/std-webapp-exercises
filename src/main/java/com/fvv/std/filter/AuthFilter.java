package com.fvv.std.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class AuthFilter implements Filter {

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		final HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		
		final Object loggedUser = httpServletRequest.getSession().getAttribute("loggedUser");
		
		if(loggedUser != null) {
			final String username = loggedUser.toString();
			System.out.println(username);
		} else {
			System.out.println("No authentication found...");
		}		
		
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig config) throws ServletException {

	}

}
