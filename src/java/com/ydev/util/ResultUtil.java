/**
 * Created By: Comwave Project Team
 * Created Date: 2012-12-7 下午3:22:14
 */
package com.ydev.util;

import java.util.List;

/**
 * @author Tom Yang
 * @version 1.0
 */
public class ResultUtil {
	public static <T> T firstResult(List<T> results) {
		T t = null;
		if (results != null && results.size() > 0) {
			t = results.get(0);
		}
		return t;
	}
}
