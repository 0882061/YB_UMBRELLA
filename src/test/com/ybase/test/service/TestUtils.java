/**
 * Created By: YBASE
 * Created Date: 2013-4-29 上午11:46:44
 * Author: Tom Yang
 */
package com.ybase.test.service;

import org.junit.Test;

import com.ybase.test.base.BaseTestSevice;
import com.ydev.util.StringUtil;

/**
 * @author Tom Yang
 * @version 1.0
 */
public class TestUtils extends BaseTestSevice{
	
	@Test
	public void testStringUtils_IsNotNullOrEmpty() {
		boolean flag = StringUtil.isNotNullOrEmpty("");
		assertEquals(false, flag);
		
		flag = StringUtil.isNotNullOrEmpty("   ");
		assertEquals(false, flag);
		
		flag = StringUtil.isNotNullOrEmpty(null);
		assertEquals(false, flag);
		
		flag = StringUtil.isNotNullOrEmpty("ss");
		assertEquals(true, flag);
	}
	
	@Test
	public void testIsNullOrEmpty() {
		boolean flag = StringUtil.isNullOrEmpty("");
		assertEquals(true, flag);
		
		flag = StringUtil.isNullOrEmpty("   ");
		assertEquals(true, flag);
		
		flag = StringUtil.isNullOrEmpty(null);
		assertEquals(true, flag);
		
		flag = StringUtil.isNullOrEmpty("ss");
		assertEquals(false, flag);
	}
}
