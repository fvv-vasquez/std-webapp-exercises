package com.fvv.std.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Utility class for Maths.
 * 
 * @author Fatima Vasquez
 * <p>Created on 2018</p>
 * @version 1.0 	
 *
 */
public final class MathUtil {
	
	/**
	 * To round a double value.
	 * 
	 * @param value of Double type.
	 * @param places of Integer type.
	 * @return a double.
	 */
	public static Double round(final Double value) {
		BigDecimal bd = new BigDecimal(Double.toString(value));
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
}
