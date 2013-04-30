/**
 * Created By: YBASE
 * Created Date: 2013-4-29 上午11:44:06
 * Author: Tom Yang
 */
package com.ydev.util;

/**
 * @author Tom Yang
 * @version 1.0
 */
public class StringUtil {

	public static boolean isNotNullOrEmpty(String dest) {
		boolean flag = true;
		if (dest == null || "".equals(dest.trim())) {
			flag = false;
		}
		return flag;
	}
	
	public static boolean isNullOrEmpty(String dest) {
		boolean flag = false;
		if(dest == null || "".equals(dest.trim())) {
			flag = true;
		}
		return flag;
	}
}
