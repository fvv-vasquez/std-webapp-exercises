package com.fvv.std.controller;

import java.util.HashMap;
import java.util.Map;

import com.fvv.std.bean.User;

/**
 * 
 * 
 * @author Fatima Vasquez
 * <p>Created on 2018</p>
 * @version 1.0 	
 *
 */
public class LoginControllerImpl implements LoginController {
	
	private Map<String, String> userDataBase;
	
	public LoginControllerImpl() {
		this.userDataBase = new HashMap<>();
		this.populateDatabase();
	}
	
	@Override
	public boolean validateLogin(final User user) {
		boolean isValid = false;
		if (this.userDataBase.containsKey(user.getName())) {
			String value = this.userDataBase.get(user.getName());
			if (value.equals(user.getPassword())) {
				isValid = true;
			}
		}
		return isValid;
	}
	
	public void populateDatabase() {
		this.userDataBase.put("fvv", "secret");
		this.userDataBase.put("csantos", "pass");
	}
}
