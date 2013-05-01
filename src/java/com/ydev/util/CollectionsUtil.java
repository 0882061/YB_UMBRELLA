package com.ydev.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CollectionsUtil {
	
	private static final Log logger = LogFactory.getLog(CollectionsUtil.class);

	public static <T> T dealWithNull(T t) {
		if(t==null){
			try {
				t = (T)t.getClass().newInstance();
			} catch (Exception e) {
				logger.error(e.getMessage(),e);
			}
		}
		return t;
	}

}
