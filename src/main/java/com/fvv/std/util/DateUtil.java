package com.fvv.std.util;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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
	
	public static Date convertLocalDateToDate(final LocalDate localDate) {
    	return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }
}
