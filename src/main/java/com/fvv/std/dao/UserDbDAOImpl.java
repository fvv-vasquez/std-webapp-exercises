package com.fvv.std.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.fvv.std.bean.UserDB;
import com.fvv.std.enums.SqlQueryEnum;
import com.fvv.std.exception.DaoException;

public class UserDbDAOImpl implements UserDbDAO {

	@Override
	public boolean checkLogin(UserDB userDB) throws DaoException {
		try (
				Connection connection = ConnectionFactory.getInstance().getConnection();
				PreparedStatement ps = connection.prepareStatement(SqlQueryEnum.LOGIN_SELECT.getQuery())
		) {
			ps.setString(1, userDB.getName());
			ps.setString(2, userDB.getPassword());
			try (ResultSet rs = ps.executeQuery()) {
				if (rs.next()) {               
				    return rs.getInt("records") == 1;
				}
			}
		} catch (SQLException e) {
			throw new DaoException("Login not found", e);
		}
		return false;
	}

}
