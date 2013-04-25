/**
 * Created By: Comwave Project Team
 * Created Date: 2012-12-6 下午3:21:46
 */
package com.ydev.action.sample;

import com.opensymphony.xwork2.ActionSupport;
import com.ydev.domain.User;
import com.ydev.service.sample.IUserManager;

/**
 * @author Tom Yang
 * @version 1.0
 */
@SuppressWarnings("serial")
public class Sample extends ActionSupport {

	private IUserManager userManager;

	private User user;

	public String execute() {
		Integer userId = user.getId();

		User user = userManager.queryUser(userId);
		if (user == null || user.getSysUser() == null || !user.getSysUser()) {
			return ERROR;
		}
		return SUCCESS;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setUserManager(IUserManager userManager) {
		this.userManager = userManager;
	}

}
