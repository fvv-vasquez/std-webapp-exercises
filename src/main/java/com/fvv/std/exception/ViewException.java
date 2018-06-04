package com.fvv.std.exception;

/**
 * Exception class for a View error.
 * 
 * @author Fatima Vasquez
 * <p>Created on 2018</p>	
 * @version 1.0 	
 *
 */
public class ViewException extends Exception {

	/**
	 * Serial version for View Exception
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Message of View error.
	 * 
	 * @param message of error
	 * @param e original exception
	 */
	public ViewException(String message, Throwable e) {
		super(message, e);
	}
}
