package com.fvv.std.bean;

public class UserDB {

	private String name;
	private String password;
	private String permission;
	
	public UserDB() {
	}
	
	public UserDB(String name, String password, String permission) {
		name = this.name;
		password = this.password;
		permission = this.permission;
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
	 * @return the permission
	 */
	public String getPermission() {
		return this.permission;
	}

	/**
	 * @param permission to set
	 */
	public void setPermission(String permission) {
		this.permission = permission;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "Name: " + this.getName() + " - Password: " + this.getPassword() + " - Permission: " + this.getPermission();
	}
}
