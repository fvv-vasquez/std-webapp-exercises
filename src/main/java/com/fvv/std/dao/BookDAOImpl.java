package com.fvv.std.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fvv.std.bean.Book;
import com.fvv.std.enums.SqlQueryEnum;
import com.fvv.std.exception.DaoException;

/**
 * DAO Class of a Book object, with main database operations from CRUD methods.
 * 
 * @author Fatima Vasquez
 * <p>Created on 2018</p>	
 * @version 1.0 	
 *
 */
public class BookDAOImpl implements BookDAO {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void addBook(final Book book) throws DaoException {
		try (
				Connection conn = ConnectionFactory.getConnection(); 
				PreparedStatement ps = conn.prepareStatement(SqlQueryEnum.BOOK_INSERT.getQuery())
		) {					
			ps.setString(1, book.getTitle());
			ps.setDouble(2, book.getUnitPrice());
			ps.setObject(3, book.getPublicationDate());
			ps.execute();
		} catch(SQLException e) {
			throw new DaoException("Error to add a book", e);
		} 
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Book> listBooks() throws DaoException {
		List<Book> books = new ArrayList<>();
		try (
				Connection conn = ConnectionFactory.getConnection(); 
				PreparedStatement ps = conn.prepareStatement(SqlQueryEnum.BOOK_SELECT_ALL.getQuery());
				ResultSet rs = ps.executeQuery()
		) {				
			while(rs.next()) {
				Book book = new Book();
				book.setId(rs.getLong("book_id"));
				book.setTitle(rs.getString("book_title"));
				book.setUnitPrice(rs.getDouble("book_unit_price"));
				book.setPublicationDate(rs.getObject("book_publication_date", LocalDate.class));	
				books.add(book);
			}
		} catch(SQLException e) {
			throw new DaoException("Error to load the list", e);
		} 
		return books;
	}
}
