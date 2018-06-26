package com.fvv.std.dao;

import com.fvv.std.bean.UserDB;
import com.fvv.std.exception.DaoException;

public interface UserDbDAO {
	
	boolean checkLogin(UserDB userDB) throws DaoException;

}
