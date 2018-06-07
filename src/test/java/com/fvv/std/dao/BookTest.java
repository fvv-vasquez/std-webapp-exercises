package com.fvv.std.dao;

import java.util.List;

import com.fvv.std.bean.Book;
import com.fvv.std.controller.BookController;
import com.fvv.std.controller.BookControllerImpl;
import com.fvv.std.controller.RandomNumberTableImpl;
import com.fvv.std.exception.ControllerException;

public class BookTest {

	public static void main(String[] args) {

	RandomNumberTableImpl raTableImpl = new RandomNumberTableImpl();
	
	System.out.println(raTableImpl.generateRandomColumnOne());
	
		
	}

}
