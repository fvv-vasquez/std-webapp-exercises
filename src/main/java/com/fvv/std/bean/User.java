package com.fvv.std.bean;

/**
 * 
 * 
 * @author Fatima Vasquez
 * <p>Created on 2018</p>
 * @version 1.0 	
 *
 */
public class User {

	private String name;
	private String password;
	
	public User() {
	}
	
	public User(String name, String password) {
		name = this.name;
		password = this.password;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "Name: " + this.getName() + " - Password: " + this.getPassword();
	}
}
