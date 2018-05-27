package com.fvv.std.controller;

import com.fvv.std.bean.User;

/**
 * 
 * 
 * @author Fatima Vasquez
 * <p>Created on 2018</p>
 * @version 1.0 	
 *
 */
public interface LoginController {

	boolean validateLogin(final User user);
}
