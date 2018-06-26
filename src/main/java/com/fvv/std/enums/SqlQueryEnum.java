package com.fvv.std.enums;

/**
 * Enum for SQL constants.
 * 
 * @author Fatima Vasquez
 * <p>Created on 2018</p>	
 * @version 1.0 	
 *
 */
public enum SqlQueryEnum {
	
	BOOK_INSERT("INSERT INTO tb_book (book_title, book_unit_price, book_publication_date) VALUES (?, ?, ?)"),
	
	BOOK_SELECT_ALL("SELECT * FROM tb_book"),
	
	LOGIN_SELECT("SELECT count(*) AS records FROM tb_user WHERE user_name = ? AND user_password = ?");
	
	private final String query;
	
	/**
	 * Enum constructor.
	 * 
	 * @param query of String type.
	 */
	SqlQueryEnum(final String query) {
		this.query = query;
	}

	/**
	 * @return the query.
	 */
	public String getQuery() {
		return query;
	}	
}
