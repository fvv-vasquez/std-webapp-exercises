package com.fvv.std.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Class Connection Factory to implement a connection with the database.
 * 
 * @author Fatima Vasquez
 * <p>Created on 2018</p>	
 * @version 1.0 	
 *
 */
public class ConnectionFactory {

	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/webexercises_db";
	private static final String DB_USER = "root";
	private static final String DB_PASS = "test1234";
	private static ConnectionFactory instance;
	private Connection connection;

	/**
	 * It opens a connection with the database.
	 * @return a connection object.
	 * @throws SQLException when a problem in database happens.
	 */
    private ConnectionFactory() throws SQLException {
    	try {
    		Class.forName(DB_DRIVER);
    		this.connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    	} catch (ClassNotFoundException e) {
    		throw new SQLException(e.getMessage());
    	}
    }
    
    public Connection getConnection() {
        return connection;
    }
    
    public static ConnectionFactory getInstance() throws SQLException {
    	if (instance == null) {
    		instance = new ConnectionFactory();
    	}
    	return instance;
    }
}
