package com.fvv.std.controller;

import com.fvv.std.bean.UserDB;
import com.fvv.std.exception.ControllerException;

public interface UserDbController {
	
	boolean checkLogin(UserDB userDB) throws ControllerException;

}
