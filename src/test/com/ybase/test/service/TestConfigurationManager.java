/**
 * Created By: YBASE
 * Created Date: 2013-4-30 下午12:55:13
 * Author: Tom Yang
 */
package com.ybase.test.service;

import org.junit.Test;

import com.ybase.test.base.BaseTestSevice;
import com.ydev.service.security.ConfigurationManager;

/**
 * @author Tom Yang
 * @version 1.0
 */
public class TestConfigurationManager extends BaseTestSevice {
	
	private ConfigurationManager configurationManager;
	
	@Test
	public void testGetAppSetting() {
		String value = configurationManager.getAppSetting("host.customer.base.url");
		assertEquals("http://localhost:9081/umb", value);
		
		value = configurationManager.getAppSetting("host.admin.base.url");
		assertEquals("http://localhost:9081/umb/adminIndex", value);
		
		value = configurationManager.getAppSetting("ldap.url");
		assertEquals("http://localhost:1422",value);
	}

	public void setConfigurationManager(ConfigurationManager configurationManager) {
		this.configurationManager = configurationManager;
	}
}
