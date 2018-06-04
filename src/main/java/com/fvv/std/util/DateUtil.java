package com.fvv.std.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 
 * 
 * @author Fatima Vasquez
 * <p>Created on 2018</p>
 * @version 1.0 	
 *
 */
public class DateUtil {

	public static LocalDate stringToLocalDate(final String strDate) {
		return LocalDate.parse(strDate, DateTimeFormatter.ofPattern(Constants.DATE_MASK));
	}
}
