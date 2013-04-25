/**
 * Created By: Comwave Project Team
 * Created Date: 2012-12-10 下午3:49:05
 */
package com.ydev.action.sample;

import java.util.Date;
import java.util.List;

import org.apache.struts2.json.annotations.JSON;

import com.opensymphony.xwork2.ActionSupport;
import com.ydev.domain.User;
import com.ydev.service.sample.IUserManager;

/**
 * @author Geln Yang
 * @version 1.0
 */
public class AjaxListUser extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private List<User> userList;

	private String memo;

	private String test;

	private int myInt;

	private String[] myArrays;
	
	private  String nullProp;
	
	private Date now;

	private IUserManager userManager;

	public String execute() {
		return SUCCESS;
	}

	public String listUsers() {
		userList = userManager.getUsers();
		memo = "你好";
		test = "haha...";
		myInt = 1495;
		myArrays = new String[] { "my god!", "oh deer" };
		setNow(new Date());
		return SUCCESS;
	}

	@JSON(name = "users")
	public List<User> getUserList() {
		return this.userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	@JSON(serialize = false)
	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getNullProp() {
		return nullProp;
	}

	public void setNullProp(String nullProp) {
		this.nullProp = nullProp;
	}

	public void setUserManager(IUserManager userManager) {
		this.userManager = userManager;
	}

	public String[] getMyArrays() {
		return myArrays;
	}

	public void setMyArrays(String[] myArrays) {
		this.myArrays = myArrays;
	}

	public int getMyInt() {
		return myInt;
	}

	public void setMyInt(int myInt) {
		this.myInt = myInt;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	@JSON(format="yyyy/MM/dd")
	public Date getNow() {
		return now;
	}

	public void setNow(Date now) {
		this.now = now;
	}

}
