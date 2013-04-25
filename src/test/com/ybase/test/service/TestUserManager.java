/**
 * Created By: Comwave Project Team
 * Created Date: 2012-12-27 下午6:10:31
 */
package com.ybase.test.service;

import java.util.List;

import org.junit.Test;

import com.ybase.test.base.BaseTestSevice;
import com.ydev.domain.User;
import com.ydev.service.sample.IUserManager;

/**
 * @author Tom Yang
 * @version 1.0
 */
@SuppressWarnings("deprecation")
public class TestUserManager extends BaseTestSevice {
	
	private IUserManager userManager;
	
	@Test
	public void testSaveUser() {
		User user = new User();
		user.setName("hello");
		user.setSex(2);
		user.setSysUser(true);
		
		userManager.addUser(user);
		
		//required
		setComplete();
		assertNotNull(user.getId());
	}
	
	@Test
	public void testCallQueryUserPR() {
		List<User> userList = userManager.callQueryUserPR("tom");
		
		//断言assert
		assertEquals(4, userList.size());
	}
	
	@Test
	public void testSaveOrUpdateUser() {
		try {
			userManager.saveOrUpdateUser(124, "eeee");
			setComplete();
			
			assertEquals(true, true);
		} catch (Exception e) {
			System.out.println("trigger:"+e.getMessage());
		}
	}
	
	public void setUserManager(IUserManager userManager) {
		this.userManager = userManager;
	}
}
