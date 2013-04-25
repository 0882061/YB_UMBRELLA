/**
 * Created By: Comwave Project Team
 * Created Date: 2012-12-27 下午6:03:35
 */
package com.ybase.test.base;

import org.springframework.test.AbstractTransactionalSpringContextTests;

/**
 * @author Geln Yang
 * @version 1.0
 */
@SuppressWarnings({"deprecation" })
public class BaseTestSevice extends AbstractTransactionalSpringContextTests{
	
	protected String[] getConfigLocations() {
		setAutowireMode(AUTOWIRE_BY_NAME);
		return new String[] {"classpath:spring/applicationContext*.xml","file:WebRoot/WEB-INF/applicationContext*.xml"};
	}
	
}
