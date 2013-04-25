/**
 * Created By: YBASE
 * Created Date: 2013-4-19 上午11:36:45
 * Author: Tom Yang
 */
package com.ydev.domain;

import java.util.Date;

/**
 * 系统用户
 * 
 * @author Tom Yang
 * @version 1.0
 */
public class SysUser {
	
	/**
	 * 系统用户编号(主键)
	 */
	private String id;
	
	/**
	 * 密码
	 */
	private String passwd;
	
	/**
	 * 角色
	 */
	private String role;
	
	/**
	 * 邮箱
	 */
	private String email;
	
	/**
	 * 上次登录时间
	 */
	private Date logDate;
	
	/**
	 * 系统用户状态
	 * 0 异常
	 * 1 正常
	 */
	private Integer status;

	/* Constructor */
	public SysUser() {
		super();
	}

	/* Getter,Setter */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getLogDate() {
		return logDate;
	}

	public void setLogDate(Date logDate) {
		this.logDate = logDate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}	
	
}
