package com.fvv.std.dao;

import com.fvv.std.bean.UserDB;
import com.fvv.std.controller.UserDbController;
import com.fvv.std.controller.UserDbControllerImpl;
import com.fvv.std.exception.ControllerException;
import com.fvv.std.exception.DaoException;

public class BookTest {

	public static void main(String[] args) throws DaoException, ControllerException {
		
		UserDB usDb = new UserDB();
		usDb.setName("css");
		usDb.setPassword("pass");
		
		UserDbController usController = new UserDbControllerImpl();
		
		boolean cont = usController.checkLogin(usDb);
		System.out.println(cont);
	}
}
