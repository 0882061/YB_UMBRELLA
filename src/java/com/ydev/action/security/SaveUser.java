/**
 * Created By: Comwave Project Team
 * Created Date: 2012-12-7 下午12:33:18
 */
package com.ydev.action.security;

import com.opensymphony.xwork2.ActionSupport;
import com.ydev.domain.User;
import com.ydev.service.sample.IUserManager;

/**
 * @author Geln Yang
 * @version 1.0
 */
@SuppressWarnings("serial")
public class SaveUser extends ActionSupport {
	private IUserManager userManager;

	private User user;
	
	public String execute() {
		if (user == null) {
			addActionError("user is null!");
			return ERROR;
		}
		userManager.addUser(user);
		return SUCCESS;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public User getUser() {
		return this.user;
	}
	
	public void setUserManager(IUserManager userManager) {
		this.userManager = userManager;
	}
}
