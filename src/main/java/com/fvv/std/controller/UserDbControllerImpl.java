package com.fvv.std.controller;

import com.fvv.std.bean.UserDB;
import com.fvv.std.dao.UserDbDAO;
import com.fvv.std.dao.UserDbDAOImpl;
import com.fvv.std.exception.ControllerException;
import com.fvv.std.exception.DaoException;

public class UserDbControllerImpl implements UserDbController {
	
	private final UserDbDAO userDao;
	
	public UserDbControllerImpl() {
		this.userDao = new UserDbDAOImpl();
	}

	@Override
	public boolean checkLogin(UserDB userDB) throws ControllerException {
		try {
			return this.userDao.checkLogin(userDB);
		} catch (DaoException e) {
			throw new ControllerException("Login not found", e);
		}
	}

	@Override
	public String checkPermission(UserDB userDB) throws ControllerException {
		try {
			return this.userDao.checkPermission(userDB);
		} catch (DaoException e) {
			throw new ControllerException("Permission not found", e);
		}
	}
}
