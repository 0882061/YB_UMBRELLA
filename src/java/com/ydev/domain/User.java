/**
 * Created By: Comwave Project Team
 * Created Date: 2012-12-6 下午3:00:49
 */
package com.ydev.domain;

/**
 * @author Tom Yang
 * @version 1.0
 */
public class User {
	/** 编号 */
	private Integer id;

	/** 姓名 */
	private String name;

	/** 性别 */
	private Integer sex;

	/** 系统用户 */
	private Boolean sysUser;

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Boolean getSysUser() {
		return sysUser;
	}

	public void setSysUser(Boolean sysUser) {
		this.sysUser = sysUser;
	}

}
